package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;

public class BirdTimeProxy implements Flayable {
    private Flayable flayable;
    public BirdTimeProxy(Flayable flayable){
        this.flayable = flayable;
    }
    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        flayable.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly All time = " + (end - start));
    }
}
