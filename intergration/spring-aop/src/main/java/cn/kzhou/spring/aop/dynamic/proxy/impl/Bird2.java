package cn.kzhou.spring.aop.dynamic.proxy.impl;

public class Bird2 extends Bird {
    @Override
    public void fly() {
        long start = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly All time = " + (end - start));
    }
}
