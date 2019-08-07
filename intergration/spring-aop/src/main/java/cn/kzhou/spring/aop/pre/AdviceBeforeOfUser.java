package cn.kzhou.spring.aop.pre;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AdviceBeforeOfUser implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("-----------------------");
        System.out.println("验证用户权利！");
    }
}
