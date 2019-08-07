package cn.compaind.duck.step3;

/**
 * 鸭子模拟器
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.simulate();
    }
    public void simulate(){
        Quickable m = new QuackCount(new MallardDuck());
        Quickable r = new QuackCount(new RedHeadDuck());
        Quickable d = new QuackCount(new DuckCall());
        Quickable ru = new QuackCount(new RubberDuck());
        GooseAdapter g = new GooseAdapter(new Goose());
        System.out.println("Duck Simulator: with Decorator");
        simulate(m);
        simulate(r);
        simulate(d);
        simulate(ru);
        simulate(g);

        System.out.println("The Ducks quacked "+QuackCount.getNumberOfQuacks()+" times.");
    }
    public void simulate(Quickable quickable){
        quickable.quick();
    }

}
