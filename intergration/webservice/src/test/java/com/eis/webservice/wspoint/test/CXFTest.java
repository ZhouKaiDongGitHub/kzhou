package com.eis.webservice.wspoint.test;

import com.eis.webservice.cxf.domain.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import java.util.Collection;

public class CXFTest {
    //保存
    @Test
    public void test1(){
        WebClient.create("http://localhost:8085/webservice_core_war/webservice/userService/user").post(new User(11,"zhangsan",123));
    }

    //删除
    @Test
    public void test2(){
        WebClient.create("http://localhost:8085/webservice_core_war/webservice/userService/user").query("id",11).delete();
    }

    //更新
    @Test
    public void test3(){
        WebClient.create("http://localhost:8085/webservice_core_war/webservice/userService/user").put(new User(11,"zhangsan",123));
    }

    //查询所有
    @Test
    public void test4(){
        Collection<? extends User> collection = WebClient.create("http://localhost:8085/webservice_core_war/webservice/userService/user").getCollection(User.class);
        for (User user: collection
             ) {
            System.out.println(user);
        }
    }
}
