package kzhou.datda.structure.tree;

public class Node {
    int element;
    Node leftChild;
    Node rightChild;

    Node(){

    }
    Node(Node left,int ele,Node right){
        this.leftChild = left;
        this.element = ele;
        this.rightChild = right;
    }
}
