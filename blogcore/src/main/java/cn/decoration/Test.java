package cn.decoration;

import cn.decoration.bedecorator.DarkRoast;
import cn.decoration.bedecorator.Decaf;
import cn.decoration.bedecorator.Esprosso;
import cn.decoration.decorator.Milk;
import cn.decoration.decorator.Mocha;

public class Test {
    @org.junit.Test
    public void StarBuuk(){
        Beverage beverage = new Esprosso();
        System.out.println(beverage.getDescripe()+beverage.cast());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescripe()+beverage1.cast());

        Beverage beverage2 = new Decaf();
        beverage2.setSize(Beverage.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescripe()+beverage2.cast());

    }
}
