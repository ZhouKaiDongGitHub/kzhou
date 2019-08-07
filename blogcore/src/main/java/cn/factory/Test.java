package cn.factory;

import cn.factory.consumer.ChicogoStylePizzaStore;
import cn.factory.consumer.NYStylePizzaStore;
import cn.factory.consumer.PizzaStore;

public class Test {
    @org.junit.Test
    public void pizzaTest(){
        PizzaStore chicogoPizzaStore = new ChicogoStylePizzaStore();
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza1 =  chicogoPizzaStore.orderPizza("cheese");
        System.out.println("Tom order a "+pizza1.getName()+"\n");

        pizza1 = nyPizzaStore.orderPizza("cheese");
        System.out.println("Joy order a" +pizza1.getName());
    }
}
