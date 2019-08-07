package cn.design;

import cn.design.flayable.Flayable;
import cn.design.flayable.FlyWithWings;
import cn.design.quackable.Quackable;
import cn.design.quackable.Squack;

public class WoodDuck extends Duck {

    public WoodDuck(){
        flayable = new FlyWithWings();
        quackable = new Squack();
    }
    @Override
    public void display() {
        System.out.println("展示为木头鸭子");
    }

}
