package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observer.Observer;

public class RedHeadDuck implements Quickable {
    @Override
    public void quick() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberver() {

    }
}
