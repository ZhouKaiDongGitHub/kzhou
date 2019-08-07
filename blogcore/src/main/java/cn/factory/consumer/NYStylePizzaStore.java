package cn.factory.consumer;

import cn.factory.*;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equals("clam")){
            pizza = new NYClamPizza();
        }
        return pizza;
    }
}
