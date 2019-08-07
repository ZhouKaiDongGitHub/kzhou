package cn.decoration.bedecorator;

import cn.decoration.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        descripe = "HouseBlend";
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public double cast() {
        return 0.99;
    }
}
