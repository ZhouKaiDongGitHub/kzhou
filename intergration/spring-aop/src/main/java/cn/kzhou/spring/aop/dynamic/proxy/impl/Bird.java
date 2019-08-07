package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;

import java.util.Random;

public class Bird implements Flayable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.....");
        try{
            Thread.sleep(new Random().nextInt(1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
