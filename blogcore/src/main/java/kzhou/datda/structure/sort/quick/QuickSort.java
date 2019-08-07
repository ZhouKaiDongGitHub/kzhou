package kzhou.datda.structure.sort.quick;

public class QuickSort {

    int[] array;
    QuickSort(int[] array){
        this.array = array;
    }

    public void sort(){
        divideArray(0,array.length);
    }

    public void divideArray(int low,int high){
        if(low >= high){
            return;
        }else {
            int temp = array[low];
            int mid = paixu(low,high,temp);
            display();
            divideArray(low,mid-1);
            divideArray(mid+1,high);
        }

    }

    public int paixu(int low,int high,int temp){
        while (low<high){
            while (low<high && temp<= array[high]){
                high--;
            }
            swap(low,high);
            while (low<high && temp>= array[low]){
                low++;
            }
            swap(low,high);
        }
        return low;
    }

    public void swap(int low,int high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    //按顺序打印数组中的元素
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
}
