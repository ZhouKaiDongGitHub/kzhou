package kzhou.datda.structure.sort.maopao;

public class MaoPaoSort {
    private int[] array;
    MaoPaoSort(int[] array){
        this.array = array;
    }

    public void display(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public void bubbleSort(){
        // 对一串无序的数据进行冒泡排序，借助数组。
        for (int i = 0;i<array.length-1;i++){
            // 外层循环表示排序多少趟
            for(int j= 0;j<array.length-1-i;j++){
                // 内层循环表示每趟排序交换多少次
                if(array[j]>array[j+1]){
                    // 如果前面元素大于后面元素，两者交换
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.print("第"+(i+1)+"趟排序结果：");
            display();
        }
    }
    public void bubbleSort1(){
        // 对一串无序的数据进行冒泡排序，借助数组。

        for (int i = 0;i<array.length-1;i++){
            // 外层循环表示排序多少趟
            //设置一个标准位，表示这一趟已经交换完毕，底下无需交换
            boolean flag  = false;
            for(int j= 0;j<array.length-1-i;j++){
                // 内层循环表示每趟排序交换多少次
                if(array[j]>array[j+1]){
                    // 如果前面元素大于后面元素，两者交换
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    if(!flag){
                        flag = true;
                    }
                }
            }
            System.out.print("第"+(i+1)+"趟排序结果：");
            display();
            if(!flag) break;
        }
    }
}
