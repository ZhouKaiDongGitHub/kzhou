package cn.decoration.bedecorator;

import cn.decoration.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        descripe = "DarkRoast";
    }


    @Override
    public String getSize() {
        return size;
    }

    @Override
    public double cast() {
        return 2.99;
    }
}
