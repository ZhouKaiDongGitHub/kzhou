package kzhou.datda.structure.array;

public class OrderArray {

    private int length;
    private int maxSize;
    private int[] array;

    public OrderArray(int size){
        array = new int[size];
        maxSize = size;
        length = 0;
    }
    //查找，因为是有序的，可以使用二分查找
    public int contains(int o){
        int lower = 0;
        int upper = length-1;
        int current ;
        while(lower<=upper){
            current = (lower+upper)/2;
            if(o==array[current]){
                return current;
            }else if(o<array[current]){
                upper = current-1;
            }else if(o>array[current]){
                lower = current+1;
            }
        }
        return -1;
    }
    public boolean add(int o){
        int inxdx = 0;
        if(length==maxSize){
            return false;
        }else {
            for(;inxdx<length;inxdx++){
                if(array[inxdx]>o){
                    break;
                }
            }
            for(int i=length;i>inxdx;i--){
                array[length] = array[length-1];
            }
            array[inxdx] = o;
            length++;
            return true;
        }
    }
    public Boolean remove(int o){
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
