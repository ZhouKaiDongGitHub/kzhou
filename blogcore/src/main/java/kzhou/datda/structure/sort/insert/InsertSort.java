package kzhou.datda.structure.sort.insert;

public class InsertSort {
    private int[] array;
    InsertSort(int[] array){
        this.array = array;
    }

    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public void insertSort(){
        int len = array.length;
        int counter = 1;

        for(int i=1;i<len;i++){

            int temp = array[i];  //存储待排序的元素值
            int insertPoint = i-1;  //与待排序元素值作比较的元素的下标

            while(insertPoint>=0 && array[insertPoint]>temp){ //当前元素比待排序元素大
                array[insertPoint+1]= array[insertPoint];  //当前元素后移一位
                insertPoint--;
            }
            array[insertPoint+1]= temp;  //找到了插入位置，插入待排序元素

            System.out.print("第"+counter+"轮排序结果：");
            display();
            counter++;
        }
    }
}
