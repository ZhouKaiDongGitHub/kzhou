package cn.compaind.duck.step5;

public class CountDuckFactory extends AbstractDuckFactory {
    @Override
    public Quickable creatMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quickable creatRedHeadDuck() {
        return new QuackCount(new RedHeadDuck());
    }

    @Override
    public Quickable creatDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quickable creatRubberDuck() {
        return new QuackCount(new RubberDuck());
    }

}
