package kzhou.datda.structure.tree;

public class TNode<E> {
    int element; //元素类型
    TNode<E> left;//左指针
    TNode<E> rigth;//右指针

    TNode(){

    }
    TNode(TNode<E> left,int element,TNode<E> rigth){
        this.left = left;
        this.element = element;
        this.rigth = rigth;
    }
}
