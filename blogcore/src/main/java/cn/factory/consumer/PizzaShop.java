package cn.factory.consumer;

import cn.factory.Pizza;
import cn.factory.producer.SimplePizzaFactory;
import cn.factory.producer.SimpleStaticPizzaFactory;

public  class PizzaShop {
    SimplePizzaFactory factory;
    public PizzaShop(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public void orderPizza(){
        Pizza pizza = factory.creatPizza("clam");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
