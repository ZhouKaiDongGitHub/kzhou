package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;

import java.util.Random;

public class BirdDy implements Flayable {
    @Override
    public void fly() {
        System.out.println("Bird is Dy flying.....");
        try{
            Thread.sleep(new Random().nextInt(1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
