package cn.abstractfactory.consumer;

import cn.abstractfactory.factory.ChicogoPizzaIngredientFactory;
import cn.abstractfactory.factory.NYPizzaIngredientFactory;
import cn.abstractfactory.factory.PizzaIngredientFactory;
import cn.factory.NYCheesePizza;
import cn.factory.NYClamPizza;
import cn.factory.Pizza;
import cn.factory.consumer.PizzaStore;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equals("clam")){
            pizza = new NYClamPizza();
        }
        return pizza;
    }
}
