package cn.compaind.duck.step4;

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
        System.out.println("Duck Simulator: with Abstract Factory");
        simulate(m);
        simulate(r);
        simulate(d);
        simulate(ru);
        simulate(g);

        System.out.println("The Ducks quacked "+ QuackCount.getNumberOfQuacks()+" times.");
    }
    public void simulate(Quickable quickable){
        quickable.quick();
    }

}
