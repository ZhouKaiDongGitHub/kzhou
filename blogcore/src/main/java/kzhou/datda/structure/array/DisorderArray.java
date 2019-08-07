package kzhou.datda.structure.array;

public class DisorderArray {
    private int length;
    private int maxSize;
    private Object[] array;

    public DisorderArray(int size){
        array = new Object[size];
        maxSize = size;
        length = 0;
    }
    public int contains(Object o){
        int inxdx = -1;
        if(length==0){
            return inxdx;
        }else{
            for(int i = 0;i<length;i++){
                if(o == array[i]){
                    inxdx = i;
                }
            }
            return inxdx;
        }
    }
    public void add(Object o){
        if(length<maxSize){
            array[length++] =o;
        }
    }
    public Boolean remove(Object o){
        int index = -1;
        if((index = contains(o))!=-1){
            for(int i=index;i<length-1;i++){
                array[index] = array[index+1];
            }
            length--;
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        for(int i = 0;i<length;i++){
            System.out.println(array[i]+"\t");
        }
    }
    public int size(){
        return length;
    }
}
