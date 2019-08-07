package cn.compaind.duck.step6.observable;


import cn.compaind.duck.step6.observer.Observer;

/**
 * 鸭子被观察者接口
 */
public interface QuackObervable {
    public void registerObserver(Observer observer);//注册观察者
    public void notifyOberver();//通知观察者
}
