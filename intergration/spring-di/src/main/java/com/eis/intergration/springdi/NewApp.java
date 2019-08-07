package com.eis.intergration.springdi;

import com.eis.intergration.springdi.dao.DataSource;
import com.eis.intergration.springdi.dao.NewPerson;
import com.eis.intergration.springdi.dao.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        NewPerson person5 = (NewPerson) ctx.getBean("person5");
        System.out.println(person5);
        NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
        System.out.println(newPerson);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());
    }
}
