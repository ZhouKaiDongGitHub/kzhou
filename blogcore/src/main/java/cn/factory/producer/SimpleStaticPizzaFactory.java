package cn.factory.producer;

import cn.factory.CheesePizza;
import cn.factory.ClamPizza;
import cn.factory.Pizza;

public class SimpleStaticPizzaFactory {
    private static Pizza pizza = null;
    public static Pizza creatPizza(String type){
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }

}
