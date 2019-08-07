package cn.design;

import cn.design.flayable.Flayable;
import cn.design.quackable.Quackable;

public abstract class Duck {

     Flayable flayable;
     Quackable quackable;

    public void swim(){
        System.out.println("所有鸭子都会游泳");
    }

    public abstract void display();

    public void performFly(){
        flayable.fly();
    }

    public void performQuack(){
        quackable.quack();
    }

    public void setFlayable( Flayable fb){
        flayable = fb;
    }

    public void setQuackable(Quackable qb){
        quackable = qb;
    }
}
