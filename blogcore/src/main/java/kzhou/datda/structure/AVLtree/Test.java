package kzhou.datda.structure.AVLtree;

public class Test {
    @org.junit.Test
    public void test1(){
        AVLTree tree = new AVLTree();
        int arr[]= {3,2,1,4,5,6,7,16,15,14,13,12,11,10,8,9};
        for (int a : arr) {
            tree.insert(a);

        }
        tree.preorder(tree.root);
    }
}
