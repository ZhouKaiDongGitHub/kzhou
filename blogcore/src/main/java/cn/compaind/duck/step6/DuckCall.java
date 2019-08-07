package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observer.Observer;

public class DuckCall implements Quickable {
    @Override
    public void quick() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberver() {

    }
}
