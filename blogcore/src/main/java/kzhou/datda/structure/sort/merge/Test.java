package kzhou.datda.structure.sort.merge;

public class Test {

    @org.junit.Test
    public void test1(){
        int [] a ={6,2,7,4,8,1,5,3};
        MergeSort sort = new MergeSort(a);
        sort.mergeSorts();
    }
}
