package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observable.QuackObervable;

/**
 * 叫的能力接口:直接继承被观察者接口
 */
public interface Quickable extends QuackObervable {
    void quick();
}
