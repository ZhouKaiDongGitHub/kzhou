package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observable.Observable;
import cn.compaind.duck.step6.observer.Observer;

public class MallardDuck implements Quickable {
    Observable observable;

    MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quick() {
        System.out.println("Quack");
        notifyOberver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyOberver() {
        observable.notifyOberver();
    }
}
