package cn.factory.consumer;

import cn.factory.ChicogoCheesePizza;
import cn.factory.ChicogoClaimPizza;
import cn.factory.Pizza;

public class ChicogoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicogoCheesePizza();
        }else if(type.equals("clam")){
            pizza = new ChicogoClaimPizza();
        }
        return pizza;
    }
}
