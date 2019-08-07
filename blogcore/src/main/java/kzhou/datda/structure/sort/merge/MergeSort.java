package kzhou.datda.structure.sort.merge;

public class MergeSort {

    int[] array;
    MergeSort(int[] array){
        this.array = array;
    }

    public void mergeSorts(){
        int[] temp = new int[array.length];//辅助数组
        recursiveMergeSort(temp,0,temp.length-1);
    }

    public void recursiveMergeSort(int[] temp,int low,int high){
        if(low == high){
            return;
        }else {
            int mid = (low+high)/2;
            recursiveMergeSort(temp,low,mid);
            recursiveMergeSort(temp,mid+1,high);
            merge(temp,low,mid,mid+1,high);
            display();
        }

    }
    public void merge(int[] temp,int leftLow,int leftHigh,int rightLow,int rightHigh){
        int k = 0;
        int length = rightHigh-leftLow+1;
        int index = leftLow;
        while (leftLow<=leftHigh && rightLow<=rightHigh){
            if(array[leftLow]<array[rightLow]){
                temp[k++] = array[leftLow++];
            }else {
                temp[k++] = array[rightLow++];
            }
        }
        while (leftLow<=leftHigh){
            temp[k++] = array[leftLow++];
        }
        while (rightLow<=rightHigh){
            temp[k++] = array[rightLow++];
        }
        for (int i=0;i<length;i++){
            array[index++] = temp[i];
        }
    }

    //按顺序打印数组中的元素
    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    /**
     * @param a 待归并数组A
     * @param lengthA
     * @param b 待归并数组B
     * @param lengthB
     * @param c 辅助数组C
     */
    public static void merge1(int[] a,int lengthA,int[] b,int lengthB,int[] c){
        int i=0,j=0,k=0;
        while (i<lengthA && j<lengthB){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while (i<lengthA){
            c[k++] = a[i++];
        }
        while (j<lengthB){
            c[k++] = b[j++];
        }
        for(int l=0;l<c.length;l++){  //打印新数组中的元素
            System.out.print(c[l]+"\t");
        }
    }
}
