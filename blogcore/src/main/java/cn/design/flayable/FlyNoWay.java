package cn.design.flayable;

public class FlyNoWay implements Flayable {
    @Override
    public void fly() {
        System.out.println("没有飞行能力");
    }
}
