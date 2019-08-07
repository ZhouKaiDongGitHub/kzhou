package cn.kzhou.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService = (OrderService)applicationContext.getBean("ordersService");
        orderService.accountMoney();
    }
}
