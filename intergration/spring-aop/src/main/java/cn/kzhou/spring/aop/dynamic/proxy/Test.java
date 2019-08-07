package cn.kzhou.spring.aop.dynamic.proxy;

import cn.kzhou.spring.aop.dynamic.proxy.impl.*;

public class Test {
    public static void main(String[] args) {
        /*Bird bird = new Bird();
        long start = System.currentTimeMillis();
        bird.fly();
        long end = System.currentTimeMillis();
        System.out.println("Fly All time = " + (end - start));*/

        /*Bird2 bird2 = new Bird2();
        bird2.fly();*/

       /* Bird bird = new Bird();
        BirdLogProxy p1 = new BirdLogProxy(bird);
        BirdTimeProxy p2 = new BirdTimeProxy(p1);
        p2.fly();*/

        /*Fish fish = new Fish();
        FishTimeProxy fishTimeProxy = new FishTimeProxy(fish);
        fishTimeProxy.swim();*/

        /*try {
            Object object =  TimeProxy.newProxyInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            TimeProxy.newProxyInstance(Flayable.class, new MyInvocationHandler(new Bird()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
