package cn.compaind.duck.step4;

/**
 * 抽象鸭子工厂，用于产生鸭子
 */
public abstract class AbstractDuckFactory {
    public abstract Quickable creatMallardDuck();
    public abstract Quickable creatRedHeadDuck();
    public abstract Quickable creatDuckCall();
    public abstract Quickable creatRubberDuck();

}
