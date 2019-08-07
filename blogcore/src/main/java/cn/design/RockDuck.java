package cn.design;

import cn.design.flayable.FlyLikeRock;
import cn.design.quackable.MuteQuack;

public class RockDuck extends Duck{

    public RockDuck(){
        flayable = new FlyLikeRock();
        quackable = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("火箭似的木鸭子");
    }
}
