package kzhou.datda.structure.link;

public class LinkedList<E>  {

    private Node<E> last;
    private Node<E> first;

    LinkedList(){
        first  = last = null;
    }

    //插入到链表的前端
    public void insertFirst(Node<E> node){
        if(!isEmpty()){
            node.prev = null;
            node.next = first;
            first.next.prev = node;
            first = node;
        }else {
            first = last = node;
            node.prev = node.next = null;
        }
    }
    //插入到链表的末端
    public void insertLast(Node<E> node){
        if(!isEmpty()){
            node.prev = last;
            node.next = null;
            last.next = node;
            last = node;
        }else {
            first = last = node;
            node.prev = node.next = null;
        }
    }
    //删除第一个链结点，返回删除的链结点引用
    public Node<E> deleteFirst() throws Exception {
        if(!isEmpty()){
            Node<E> temp = first;
            if(first.next==null){
                first = last = null;
            }else {
                first.next.prev = null;
                first = first.next;
            }
            return temp;
        }else {
            throw new Exception("链表为空，不能进行删除操作！");
        }

    }
    //删除最后一个链结点，返回删除的链结点引用
    public Node<E> deleteLast() throws Exception{
        if(!isEmpty()){
            Node<E> temp = last;
            if(last.prev==null){
                first = last = null;
            }else {
                last.prev.next = null;
                last = last.prev;
            }
            return temp;
        }else {
            throw new Exception("链表为空，不能进行删除操作！");
        }
    }

    //查找属性为指定值的链结点
    public Node<E> find(E element){
        Node<E> temp  =  first;
        Node<E> result = null;
        while (temp.next!=null){
            if(temp.item == element){
                result = temp;
                break;
            }else {
                temp = temp.next;
            }
        }
        return result;
    }
    //在指定链结点之后插入，操作成功返回true，操作失败返回false
    public boolean insertEle(Node<E> eNode){
        Node<E> temp = find(eNode.item);
        if(temp != null){
            if(temp.next != null){
                eNode.next = temp.next;
                temp.next.prev = eNode;
                eNode.prev = temp;
                temp.next = eNode;
            }else {
                eNode.next = null;
                eNode.prev = temp;
                temp.next = eNode;
                last = eNode;
            }
            return true;
        }else {
            return false;
        }
    }
    //删除指定的节点，操作成功返回true，操作失败返回false
    public boolean deleteEle(E element){
        Node<E> temp = find(element);
        if(temp != null){
            if(temp.next==null){
              temp.prev.next = null;
              last = temp.prev;
            }
            if(temp.prev == null){
                temp.next.prev = null;
                first = temp.next;
            }
            if(temp.next!=null && temp.prev != null){
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
            return true;
        }else {
            return false;
        }
    }
    //判空
    public boolean isEmpty(){
        return (first == null);
    }

}
