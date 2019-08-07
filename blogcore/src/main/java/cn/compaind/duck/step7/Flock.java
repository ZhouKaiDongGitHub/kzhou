package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observable.Observable;
import cn.compaind.duck.step6.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 一群鸭子的集合
 */
public class Flock implements Quickable {
    public ArrayList duckList =  new ArrayList();

    Observable observable;

    public void add(Quickable quacker){
        duckList.add(quacker);
    }

    Flock(){
        observable = new Observable(this);
    }

    @Override
    public void quick() {
        Iterator iterator = duckList.iterator();
        while (iterator.hasNext()){
            Quickable quickable = (Quickable) iterator.next();
            quickable.quick();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberver() {

    }
}
