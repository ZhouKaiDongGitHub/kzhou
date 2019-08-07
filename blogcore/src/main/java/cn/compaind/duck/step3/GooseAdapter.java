package cn.compaind.duck.step3;

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
}
