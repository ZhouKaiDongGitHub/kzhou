package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Swimable;

import java.util.Random;

public class Fish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Fish is Swimming.....");
        try{
            Thread.sleep(new Random().nextInt(1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
