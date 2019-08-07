package cn.decoration.bedecorator;

import cn.decoration.Beverage;

public class Esprosso extends Beverage {

    public Esprosso(){
        descripe = "Esprosso";
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public double cast() {
        return 1.99;
    }
}
