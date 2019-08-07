package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;

public class Bird3 implements Flayable {
    private Bird bird;

    public  Bird3( Bird bird){
        this.bird = bird;
    }
    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly All time = " + (end - start));
    }
}
