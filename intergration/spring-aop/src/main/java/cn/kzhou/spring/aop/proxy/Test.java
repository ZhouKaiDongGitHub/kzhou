package cn.kzhou.spring.aop.proxy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        User user = new UserImpl();
        User proxy = new UserProxy(user).getUserProxy();
        proxy.normalUser();
        proxy.vip();
        proxy.vvip();
    }
}
