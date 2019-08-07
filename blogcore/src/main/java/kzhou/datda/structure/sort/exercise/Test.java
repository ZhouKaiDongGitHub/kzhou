package kzhou.datda.structure.sort.exercise;

public class Test {

    @org.junit.Test
    public void test1(){
        int[] array = new int[]{3,9,1,2,6,5,11};
        Exercise exercise = new Exercise(array);
        exercise.maopaoSort();
    }

    @org.junit.Test
    public void test2(){
        int[] array = new int[]{3,9,1,2,6,5,11};
        Exercise exercise = new Exercise(array);
        exercise.selectedSort();
    }
    @org.junit.Test
    public void test3(){
        int[] array = new int[]{3,9,1,2,6,5,11};
        Exercise exercise = new Exercise(array);
        exercise.insertSort();
    }
}
