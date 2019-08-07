package cn.compaind.duck.step6.observer;

import cn.compaind.duck.step6.observable.QuackObervable;

/**
 * 观察者接口
 */
public interface Observer {
    public void update(QuackObervable duck);//更改观察者状态的方法
}
