package kzhou.datda.structure.sort.exercise;

public class Exercise {
    int[] array;// 通过数组实现简单排序：冒泡，插入，选择
    Exercise(int[] array){
        this.array = array;
    }

    //冒泡排序是效率极底的交换排序
    public void maopaoSort(){
        for (int i=0;i<array.length-1;i++){
            boolean flag = false;
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
            System.out.print("第"+(i+1)+"轮排序结果：");
            display();
        }
    }

    // 选择排序效率高于冒泡
    public void selectedSort(){
        for (int i=0;i<array.length;i++){
            int index = i;//最小值下标
            for (int j=i+1;j<array.length;j++){
                if(array[index]>array[j]){
                    index = j;//最小值下标重新赋值
                }
            }
            if(index != i){
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
            System.out.print("第"+(i+1)+"轮排序结果：");
            display();
        }
    }

    // 插入排序结合二分查找会大大提交简单排序的效率
    public void insertSort(){
        for (int i=1;i<array.length;i++){
            int now = array[i];//需排列的元素
            int max = array[i-1];//有序数组的最大值
            if(now < max){
                int index = binaryFind(0,i-1,now);
                for (int j=i;j>index;j--){
                    array[j] = array[j-1];
                }
                array[index] = now;
            }
            System.out.print("第"+i+"轮排序结果：");
            display();
        }
    }
    // 二分查找，插入到返回值的后面
    public int binaryFind(int low,int high,int value){
        int mid = low+high/2;
        while (low<=high){
            if(value<array[mid]){
                high = mid-1;
            }else if(value>array[mid]){
                low = mid+1;
            }
        }
        return low;
    }


    public void display(){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    /**
     * 快速排序，冒泡排序的改进版
     */
    public void quick(){
        quickSort(0,array.length-1);
    }


    public void quickSort(int low,int high){
        if(low>=high){
            return;
        }else {
            int index = quickHelp(low,high,array[low]);
            display();
            quickSort(low,index-1);
            quickSort(index+1,high);
        }
    }

    public int quickHelp(int low,int high,int index){
        while (low<high){
            while (low<high && index<=array[high]){
                high--;
            }
            swag(low,high);
           while (low<high && index>=array[low]){
               low++;
           }
           swag(low,high);
        }
        return low;
    }

    public void swag(int low,int high){
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }
}
