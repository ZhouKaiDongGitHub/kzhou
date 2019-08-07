package kzhou.datda.structure.sort.maopao;

public class Test {

    @org.junit.Test
    public void test1(){
        int[] array = new int[]{1,5,4,11,2,20,18};
        MaoPaoSort maoPaoSort = new MaoPaoSort(array);
        maoPaoSort.bubbleSort();
    }
    @org.junit.Test
    public void test2(){
        int[] array = new int[]{1,5,4,11,2,20,18};
        MaoPaoSort maoPaoSort = new MaoPaoSort(array);
        maoPaoSort.bubbleSort1();
    }
}
