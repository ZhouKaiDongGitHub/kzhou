package kzhou.datda.structure.huoffuman;

public class Node {
    private String key;
    private int frequency;
    private Node left;
    private Node right;
    private Node next;//链表实现优先级队列的下一个节点引用

    Node(int frequency,String key){
        this.key = key;
        this.frequency = frequency;
    }

    Node(String key){
        this.key = key;
    }

    Node(int frequency){
        this.frequency = frequency;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
