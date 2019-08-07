package cn.compaind.duck.step6;

import cn.compaind.duck.step6.observer.Observer;

/**
 * 鹅的适配器，适配鸭子
 */
public class GooseAdapter implements Quickable {
    public Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quick() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberver() {

    }
}
