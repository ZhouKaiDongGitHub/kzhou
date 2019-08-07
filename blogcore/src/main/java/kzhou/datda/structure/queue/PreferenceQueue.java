package kzhou.datda.structure.queue;

public class PreferenceQueue {

    private Object[] queue;
    private int maxSize;
    private int length;
    private int referencePoint;

    public PreferenceQueue(int size,int ref){
        queue = new Object[size];
        referencePoint = ref;
        length = 0;
        maxSize = size;
    }
    public void insert(Object o){
        if(!isFull()){
            if(length == 0){
                queue[length++] = o ;
            }else{
                int i;
                for(i=length;i>0;i--){
                    int dis = Math.abs((int)o-referencePoint);
                    int curDis = Math.abs((int)queue[i-1]-referencePoint);
                    if(dis>curDis){
                        queue[i] = queue[i-1];
                    }else {
                        break;
                    }
                }
                queue[i]= o;
                length++;
            }
        }else {
            System.out.println("队列已满，无法插入");
        }
    }

    public Object remove(){
        if(!isEmpty()){
           return queue[--length];
        }else {
            return null;
        }
    }

    public Boolean isEmpty(){
        return length==0;
    }

    public Boolean isFull(){
        return length == maxSize;
    }
}
