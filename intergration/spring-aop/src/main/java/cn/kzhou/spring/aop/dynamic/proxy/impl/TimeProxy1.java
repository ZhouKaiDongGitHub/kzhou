package cn.kzhou.spring.aop.dynamic.proxy.impl;

import cn.kzhou.spring.aop.dynamic.proxy.Flayable;
import cn.kzhou.spring.aop.dynamic.proxy.InvocationHandler;
import java.lang.Override;
import java.lang.reflect.Method;

class TimeProxy1 implements Flayable {
  private InvocationHandler handler;

  public TimeProxy1(InvocationHandler handler) {
    this.handler = handler;
  }

  @Override
  public void fly() {
    try {
    	Method method = cn.kzhou.spring.aop.dynamic.proxy.Flayable.class.getMethod("fly");
    	this.handler.invoke(this, method, null);
    } catch(Exception e) {
    	e.printStackTrace();
    }
  }
}
