package cn.compaind.duck.step5;

/**
 * 鸭子模拟器
 */
public class Test {
    public static void main(String[] args) {
        AbstractDuckFactory abstractDuckFactory = new CountDuckFactory();
        Test test = new Test();
        test.simulate(abstractDuckFactory);
    }
    public void simulate(AbstractDuckFactory abstractDuckFactory){

        Quickable m = abstractDuckFactory.creatMallardDuck();
        Quickable r = abstractDuckFactory.creatRedHeadDuck();
        Quickable d = abstractDuckFactory.creatDuckCall();
        Quickable ru = abstractDuckFactory.creatRubberDuck();
        GooseAdapter g = new GooseAdapter(new Goose());
        System.out.println("Duck Simulator: with Composite- Flocks");

        Flock duckFlock = new Flock();
        duckFlock.add(m);
        duckFlock.add(r);
        duckFlock.add(d);
        duckFlock.add(ru);

        simulate(duckFlock);

        System.out.println("The Ducks quacked "+ QuackCount.getNumberOfQuacks()+" times.");
    }
    public void simulate(Quickable quickable){
        quickable.quick();
    }

}
