package cn.compaind.duck.step4;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quickable creatMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quickable creatRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quickable creatDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quickable creatRubberDuck() {
        return new RubberDuck();
    }

}
