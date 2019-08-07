package cn.compaind.duck.step6.observable;

import cn.compaind.duck.step6.observable.QuackObervable;
import cn.compaind.duck.step6.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 被观察者具体实现类，具体实现注册观察者和通知观察者
 */
public class Observable implements QuackObervable {

    ArrayList oberverList = new ArrayList();
    QuackObervable duck;
    public Observable( QuackObervable duck){
        this.duck = duck;
    }
    @Override
    public void registerObserver(Observer observer) {
        oberverList.add(observer);
    }

    @Override
    public void notifyOberver() {
        Iterator iterator = oberverList.iterator();
        while (iterator.hasNext()){
            Observer observer =(Observer) iterator.next();
            observer.update(duck);
        }
    }
}
