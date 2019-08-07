package cn.kzhou.spring.aop.pre;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AdviceAfterOfUser implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("该用户成功访问！");
    }
}
