package cn.compaind.duck.step6.observer;

import cn.compaind.duck.step6.observable.QuackObervable;

/**
 * 呱呱叫学家：观察者
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObervable duck) {
        System.out.println("Quackologist: "+duck+" just quacked!");
    }
}
