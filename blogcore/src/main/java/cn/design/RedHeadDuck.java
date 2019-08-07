package cn.design;

import cn.design.flayable.FlyWithWings;
import cn.design.quackable.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flayable = new FlyWithWings();
        quackable = new Quack();
    }
    @Override
    public void display() {
        System.out.println("展示为红头鸭子");
    }
}
