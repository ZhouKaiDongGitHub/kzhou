package cn.kzhou.spring.aop.preannotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

@Aspect
public class AdviceAfterOfUser  {

    @AfterReturning("execution(* cn.kzhou.spring.aop.preannotation.UserImpl.*(..))")
    public void afterReturning() {
        System.out.println("该用户成功访问！");
    }
}
