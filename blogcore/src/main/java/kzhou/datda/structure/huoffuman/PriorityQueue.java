package kzhou.datda.structure.huoffuman;

public class PriorityQueue {
    private int length;
    private Node first;

    PriorityQueue(){
        length = 0;
        first = null;
    }
    //插入节点
    public void insert(Node node){
        if(first == null){
            first = node;
        }else {
            Node temp = first;
            Node preTemp = null;
            while (node.getFrequency()>temp.getFrequency()){
                preTemp = temp;
                if(temp.getNext()==null){
                    temp = null;
                    break;
                }else {
                    temp = temp.getNext();
                }
            }
            if(preTemp==null){
                node.setNext(temp);
                first = node;
            }else if(temp==null){
                preTemp.setNext(node);
            }else {
                preTemp.setNext(node);
                node.setNext(temp);
            }
        }
        length++;
    }
    //删除队头元素
    public Node delete(){
        Node temp = first;
        first = first.getNext();
        length--;
        return temp;
    }
    //获取队列长度
    public int getLength(){
        return length;
    }
    //按顺序打印队列
    public void display(){
        Node cur = first;
        System.out.print("优先级队列：\t");
        while(cur != null){
            System.out.print(cur.getKey()+":"+cur.getFrequency()+"\t");
            cur = cur.getNext();
        }
        System.out.println();
    }
    //构造霍夫曼树
    public HuffmanTree buildHuffmanTree(){
        while(length > 1){
            Node hLeft = delete();  //取出队列的第一个节点作为新节点的左子节点
            Node hRight = delete(); //取出队列的第二个节点作为新节点的右子节点
            //新节点的权值等于左右子节点的权值之和
            Node hRoot = new Node(hLeft.getFrequency()+hRight.getFrequency());
            hRoot.setLeft(hLeft);
            hRoot.setRight(hRight);
            insert(hRoot);
        }
        //最后队列中只剩一个节点，即为霍夫曼树的根节点
        return new HuffmanTree(first);
    }
}
