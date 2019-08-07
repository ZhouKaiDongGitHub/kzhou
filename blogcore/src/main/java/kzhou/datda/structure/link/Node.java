package kzhou.datda.structure.link;

public class Node<E> {
    E item;
    Node<E> prev;
    Node<E> next;

    Node(Node<E> prev,E element,Node<E> next){
        this.item = element;
        this.prev = prev;
        this.next = next;
    }
    Node(E element,Node<E> next){
        this.item = element;
        this.next = next;
    }
}
