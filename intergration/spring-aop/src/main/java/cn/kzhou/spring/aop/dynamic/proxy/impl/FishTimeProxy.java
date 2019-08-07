package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Swimable;

public class FishTimeProxy implements Swimable {
    private Swimable swimable;
    public FishTimeProxy(Swimable swimable){
        this.swimable = swimable;
    }
    @Override
    public void swim() {
        long start = System.currentTimeMillis();
        swimable.swim();
        long end = System.currentTimeMillis();
        System.out.println("Fish Swimming All time = " + (end - start));
    }
}
