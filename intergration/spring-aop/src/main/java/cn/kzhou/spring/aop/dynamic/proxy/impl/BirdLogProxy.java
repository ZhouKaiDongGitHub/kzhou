package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;

public class BirdLogProxy implements Flayable {

    private Flayable flayable;
    public BirdLogProxy(Flayable flayable){
        this.flayable = flayable;
    }
    @Override
    public void fly() {
        System.out.println("Bird fly start...");
        flayable.fly();
        long end = System.currentTimeMillis();
        System.out.println("Bird fly end...");
    }
}
