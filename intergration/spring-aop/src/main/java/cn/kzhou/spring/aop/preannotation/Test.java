package cn.kzhou.spring.aop.preannotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext1.xml");
        User user = (User)app.getBean("userImpl");
        user.normalUser();
        user.vip();
    }
}
