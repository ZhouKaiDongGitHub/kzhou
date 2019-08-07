package cn.kzhou.spring.aop.preannotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.lang.reflect.Method;

@Aspect
public class AdviceBeforeOfUser {

    @Before("execution(* cn.kzhou.spring.aop.preannotation.UserImpl.*(..))")
    public void before(){
        System.out.println("-----------------------");
        System.out.println("验证用户权利！");
    }
}
