package kzhou.datda.structure.tree;

public class BinaryTreeExe {

    private Node root;//根节点
    BinaryTreeExe(){
        root = null;
    }

    //按关键字查找节点find
    public Node find(int element){
        Node temp = root;
        while (temp != null){
            if(temp.element == element){
                break;
            }else if(element < temp.element){
                temp = temp.leftChild;
            }else {
                temp = temp.rightChild;
            }
        }
        return temp;
    }


    //插入新节点
    public void insert(Node node){
        if(root == null){
            root = node;
        }
        Node temp = root;
        while (temp != null){
            if(node.element < temp.element){
                temp = temp.leftChild;
            }else if(node.element > temp.element){
                temp = temp.rightChild;
            }
        }
        temp = node;
    }

    //删除指定节点,成功为true,失败为false
    public boolean delete(int ele){
        Node parent = root;
        Node temp = root;
        boolean isLeft = false;
        while (temp != null){
            if(ele == temp.element){
                break;
            }else if(ele < temp.element){
                parent = temp;
                temp = temp.leftChild;
                isLeft = true;
            }else {
                parent = temp;
                temp = temp.rightChild;
                isLeft = false;
            }
        }
        if(temp == null){
            return false; //没有找到节点，删除失败。
        }
        //情形1：没有子节点
        if(temp.leftChild==null && temp.rightChild==null){
            if(temp == parent){
                root = null;
            }else if(isLeft){
                parent.leftChild = null;
            }else {
                parent.rightChild = null;
            }
        }else if(temp.leftChild == null){
            //情形2：只有一个子节点
            if(temp == parent){
                root = temp.rightChild;
            }else if(isLeft){
                parent.leftChild = temp.rightChild;
            }else {
                parent.rightChild = temp.rightChild;
            }
        }else if(temp.rightChild == null){
            //情形2：只有一个子节点
            if(temp == parent){
                root = temp.leftChild;
            }else if(isLeft){
                parent.leftChild = temp.leftChild;
            }else {
                parent.rightChild = temp.leftChild;
            }
        }else {
            //情形3：有两个子节点
            Node successor = temp.rightChild;
            Node successorParent = null;
            while (successor.leftChild != null){
                successorParent = successor;
                successor = successorParent.leftChild;
            }
            if(successorParent == null){
                if(temp == parent){
                    root = successor;
                    successor.leftChild = temp.leftChild;
                }else if(isLeft){
                    parent.leftChild = successor;
                    successor.leftChild = temp.leftChild;
                }else {
                    parent.rightChild = successor;
                    successor.leftChild = temp.leftChild;
                }
            }else {
                successorParent.leftChild = successor.rightChild;
                if(temp == parent){
                    root = successor;
                    successor.leftChild = temp.leftChild;
                    successor.rightChild = temp.rightChild;
                }else if(isLeft){
                    parent.leftChild = successor;
                    successor.leftChild = temp.leftChild;
                    successor.rightChild = temp.rightChild;
                }else {
                    parent.rightChild = successor;
                    successor.leftChild = temp.leftChild;
                    successor.rightChild = temp.rightChild;
                }
            }
        }
        return true;
    }
    //遍历
    public static final int PREORDER = 1;
    public static final int INNORDER = 2;
    public static final int POSTORDER = 3;
    public void invert(int type){
        switch (type){
            case 1:
                System.out.println("先序遍历：");
                preOrder(root);
                break;
            case 2:
                System.out.println("中序遍历：");
                innOrder(root);
                break;
            case 3:
                System.out.println("后序遍历：");
                postOrder(root);
                break;
        }
    }
    protected void preOrder(Node node){
        if(node != null){
            System.out.println(node.element);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }
    }
    protected void innOrder(Node node){
        if(node != null){
            preOrder(node.leftChild);
            System.out.println(node.element);
            preOrder(node.rightChild);
        }
    }
    protected void postOrder(Node node){
        if(node != null){
            preOrder(node.leftChild);
            preOrder(node.rightChild);
            System.out.println(node.element);
        }
    }
    //获取树的深度
    public int getDeep(){
        if(root == null)
            return 0;
        else {
            return getTreeDepth(root,1);
        }
    }
    protected int getTreeDepth(Node node,int deep){
        int nowDeep = deep;
        int leftDeep = nowDeep;
        int rigthDeep = nowDeep;
        if(node.leftChild != null){
            leftDeep = getTreeDepth(node.leftChild,leftDeep+1);
        }
        if(node.rightChild != null){
            rigthDeep = getTreeDepth(node.rightChild,rigthDeep+1);
        }
        return Math.max(leftDeep,rigthDeep);
    }
    //返回关键值最大的节点
    public Node getMaxNode(){
        Node temp = root;
        while (temp !=null){
            if(temp.rightChild!=null){
                temp = temp.rightChild;
            }
        }
        return temp;
    }
    //返回关键值最小的节点
    public Node getMinNode(){
        Node temp = root;
        while (temp !=null){
            if(temp.leftChild!=null){
                temp = temp.leftChild;
            }
        }
        return temp;
    }
    //以树的形式打印出该树

    //获取指定节点集合的所有子节点

    //打印指定个数的空位

    //判空
    public boolean isEmpty(){
        return (root == null);
    }
    //判断是否为叶子节点
    public boolean isLeaf(Node node){
        return (node.leftChild == null && node.rightChild == null);
    }
    //获取根节点
    public Node getRoot(){
        return root;
    }
}
