package cn.design.quackable;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
