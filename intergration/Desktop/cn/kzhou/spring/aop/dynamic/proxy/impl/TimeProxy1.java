package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;
import java.lang.Override;
import java.lang.System;

class TimeProxy1 implements Flayable {
  private Flayable flyable;

  public TimeProxy1(Flayable flyable) {
    this.flyable = flyable;
  }

  @Override
  public void fly() {
    long start = System.currentTimeMillis();

    this.flyable.fly();

    long end = System.currentTimeMillis();
    System.out.println("Fly Time =" + (end - start));
  }
}
