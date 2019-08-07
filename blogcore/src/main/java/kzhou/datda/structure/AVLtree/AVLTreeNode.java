package kzhou.datda.structure.AVLtree;

public class AVLTreeNode {
    int value;
    AVLTreeNode left;
    AVLTreeNode right;

    AVLTreeNode(int value,AVLTreeNode left ,AVLTreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public AVLTreeNode getLeft() {
        return left;
    }

    public void setLeft(AVLTreeNode left) {
        this.left = left;
    }

    public AVLTreeNode getRight() {
        return right;
    }

    public void setRight(AVLTreeNode right) {
        this.right = right;
    }
}
