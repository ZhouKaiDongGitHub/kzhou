package kzhou.datda.structure.sort.choose;

public class ChooseSort {
    private int[] array;
    ChooseSort(int [] array){
        this.array = array;
    }

    public void selectionSort(){
        // 最外层表示需要比较的趟数
        for (int i = 0;i< array.length-1;i++){
            //设置最小标志位
            int index = i;
            int temp;
            // 表示每趟比较的次数
            for (int j = i+1;j<array.length;j++){
                if(array[j]<array[index]){
                    index = j;
                }
            }
            if(i!=index){
                temp= array[i];
                array[i]= array[index];
                array[index]= temp;
            }
        }
    }
}
