package kzhou.datda.structure.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉排序树
 * @param <E>
 */
public class BinaryTree<E> {
    TNode<E> root; //跟节点
    BinaryTree(){
        root = null;//初始化，指向null
    }
    //按关键字查找节点find
    public TNode<E> find(int element){
        TNode<E> temp = root;
        while (temp!=null){
            if(element == temp.element){
               break;
            }else if((int)element < (int)temp.element){
                temp = temp.left;
            }else {
                temp = temp.rigth;
            }
        }
        return temp;
    }
    //插入新节点
    public void insert(TNode<E> node){
        TNode<E> temp = root;
        while(temp != null){
            if((int)node.element < (int)temp.element){
                temp = temp.left;
            }else if((int)node.element > (int)temp.element){
                temp = temp.rigth;
            }
        }
        temp = node;
    }
    //删除指定节点,成功为true,失败为false
    public boolean delete(int element){
        //分为三种情况 1.无子节点 2.有一个子节点 3.有两个子节点
        if(root == null){
            return false;
        }
        TNode<E> temp = root;
        TNode<E> parent = temp;
        boolean isLeft = false;
        while (temp != null){
            if((int)element == (int)temp.element){
                break;
            }else if((int)element < (int)temp.element){
                parent = temp;
                temp = temp.left;
                isLeft = true;
            }else if((int)element > (int)temp.element){
                parent = temp;
                temp = temp.rigth;
            }
        }
        if(temp == null){
            return false;//没有找到指定节点
        }
        //情形1：无子节点
        if(temp.left ==null && temp.rigth == null){
            if(temp == parent){
                root = null;
            }else if(isLeft){
                parent.left = null;
            }else {
                parent.rigth = null;
            }
        }else if(temp.left == null){
            //情形2：只有右节点
            if(temp == parent){
                root = temp;
            }else if(isLeft){
                parent.left = temp.rigth;
            }else {
                parent.rigth = temp.rigth;
            }
        }else if(temp.rigth == null){
            //情形2：只有左节点
            if(temp == parent){
                root = temp;
            }else if(isLeft){
                parent.left = temp.left;
            }else {
                parent.rigth = temp.left;
            }
        }else {
            //情形3：有两个子节点
            TNode<E> successor = temp.rigth;
            TNode<E> successorParent = null;
            while (successor.left!=null){
                successorParent = successor;
                successor = successor.left;
            }
            if(successorParent ==null){
                if(parent == temp){
                    root = successor;
                    successor.left = temp.left;
                }else if(isLeft){
                    parent.left = successor;
                    successor.left = temp.left;
                }else {
                    parent.rigth = successor;
                    successor.left = temp.left;
                }
            }else {
                successorParent.left = successor.rigth;
                if(parent == temp){
                    root = successor;
                    root.left = temp.left;
                    root.rigth = temp.rigth;
                }else if(isLeft){
                    parent.left = successor;
                    successor.left = temp.left;
                    successor.rigth = temp.rigth;
                }else {
                    parent.rigth = successor;
                    successor.left = temp.left;
                    successor.rigth = temp.rigth;
                }
            }

        }

        return true;
    }
    //遍历
    public static final int PREORDER = 1;   //前序遍历
    public static final int INORDER = 2;    //中序遍历
    public static final int POSTORDER = 3;  //中序遍历
    public void traverse(int type){
        switch (type){
            case 1:
                System.out.println("先序遍历：");
                preorder(root);
                System.out.println();
                break;
            case 2:
                System.out.println("中序遍历：");
                inorder(root);
                System.out.println();
                break;
            case 3:
                System.out.println("后序遍历：");
                postorder(root);
                System.out.println();
                break;
        }
    }
    public void preorder(TNode<E> tempRoot){
        if(tempRoot!=null){
            System.out.print(tempRoot.element+"\t");
            preorder(tempRoot.left);
            preorder(tempRoot.rigth);
        }
    }
    public void inorder(TNode<E> tempRoot){
        if(tempRoot!=null){
            preorder(tempRoot.left);
            System.out.print(tempRoot.element+"\t");
            preorder(tempRoot.rigth);
        }
    }
    public void postorder(TNode<E> tempRoot){
        if(tempRoot!=null){
            preorder(tempRoot.left);
            preorder(tempRoot.rigth);
            System.out.print(tempRoot.element+"\t");
        }
    }
    //私有方法，用迭代方法来获取左子树和右子树的最大深度，返回两者最大值
    private int getDepth(TNode<E> tempRoot,int deep){
        int deepadd = deep;//初始深度
        int leftDeep = deepadd;
        int rightDeep = deepadd;
        if(tempRoot.left!=null){
            leftDeep = getDepth(tempRoot.left,deepadd+1);
        }
        if(tempRoot.rigth!=null){
            rightDeep = getDepth(tempRoot.rigth,deepadd+1);
        }
        return Math.max(leftDeep,rightDeep);
    }

    //获取树的深度
    public int getTreeDepth(){
        if(root == null){
            return 0;
        }else {
            return getDepth(root,1);
        }
    }
    //返回关键值最大的节点
    public TNode getMax(){
        if(isEmpty()){
            return null;
        }
        TNode cur = root;
        while(cur.rigth != null){
            cur = cur.rigth;
        }
        return cur;
    }
    //返回关键值最小的节点
    public TNode getMin(){
        if(isEmpty()){
            return null;
        }
        TNode cur = root;
        while(cur.left != null){
            cur = cur.left;
        }
        return cur;
    }
    //以树的形式打印出该树
    public void displayTree(){
        int depth = getTreeDepth();
        ArrayList<TNode> currentLayerNodes = new ArrayList<TNode>();
        currentLayerNodes.add(root);  //存储该层所有节点
        int layerIndex = 1;
        while(layerIndex <= depth){
            int NodeBlankNum = (int)Math.pow(2, depth-layerIndex)-1;  //在节点之前和之后应该打印几个空位
            for(int i = 0;i<currentLayerNodes.size();i++){
                TNode node = currentLayerNodes.get(i);
                printBlank(NodeBlankNum);   //打印节点之前的空位

                if(node == null){
                    System.out.print("*\t");  //如果该节点为null，用空位代替
                }else{
                    System.out.print("*  "+node.element+"\t");  //打印该节点
                }

                printBlank(NodeBlankNum);  //打印节点之后的空位
                System.out.print("*\t");   //补齐空位
            }
            System.out.println();
            layerIndex++;
            currentLayerNodes = getAllNodeOfThisLayer(currentLayerNodes);  //获取下一层所有的节点
        }
    }
    //获取指定节点集合的所有子节点
    private ArrayList getAllNodeOfThisLayer(List parentNodes){
        ArrayList list = new ArrayList<TNode>();
        TNode parentNode;
        for(int i=0;i<parentNodes.size();i++){
            parentNode = (TNode)parentNodes.get(i);
            if(parentNode != null){
                if(parentNode.left != null){  //如果上层的父节点存在左子节点，加入集合
                    list.add(parentNode.left);
                }else{
                    list.add(null);  //如果上层的父节点不存在左子节点，用null代替，一样加入集合
                }
                if(parentNode.rigth != null){
                    list.add(parentNode.rigth);
                }else{
                    list.add(null);
                }
            }else{  //如果上层父节点不存在，用两个null占位，代表左右子节点
                list.add(null);
                list.add(null);
            }
        }
        return list;
    }

    //打印指定个数的空位
    private void printBlank(int num){
        for(int i=0;i<num;i++){
            System.out.print("*\t");
        }
    }
    //判空
    public boolean isEmpty(){
        return (root==null);
    }
    //判断是否为叶子节点
    public boolean isLeaf(TNode<E> node){
        return (node.left ==null && node.rigth ==null);
    }
    //获取根节点
    public TNode<E> getRoot() {
        return root;
    }
}
