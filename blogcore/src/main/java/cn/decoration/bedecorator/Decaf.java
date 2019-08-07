package cn.decoration.bedecorator;

import cn.decoration.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        descripe = "Decaf";
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public double cast() {
        return 3.99;
    }
}
