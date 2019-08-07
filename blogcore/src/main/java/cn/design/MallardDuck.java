package cn.design;

import cn.design.flayable.FlyNoWay;
import cn.design.quackable.Squack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flayable = new FlyNoWay();
        quackable = new Squack();
    }
    @Override
    public void display() {
        System.out.println("展示为野鸭子");
    }
}
