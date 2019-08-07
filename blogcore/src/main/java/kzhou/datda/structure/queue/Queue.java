package kzhou.datda.structure.queue;

public class Queue {

    private int front;
    private int rear;
    private int maxSize;//数组长度
    private int length;

    private Object[] objectQueue;
    public Queue(int size){
        objectQueue = new Object[size];
        maxSize = size;
        front = rear = 0; //初始化指向下标0
        length = 0; //初始化已有元素为0
    }

    public void insert(Object o){
        if(!isFull()){
            if(rear == maxSize){
                rear = 0;
            }
            objectQueue[rear++] = o;
            length++;
        }else{
            System.out.println("队列已满！");
        }
    }
    public Object remove(){
        if(!isEmpty()){
            if(front == maxSize){
                front = 0;
            }
            length--;
            return objectQueue[front++];
        }else {
            System.out.println("队列为空！");
            return null;
        }
    }
    public Boolean isEmpty(){
        return (length==0);
    }
    public Boolean isFull(){
        return (maxSize == length);
    }
}
