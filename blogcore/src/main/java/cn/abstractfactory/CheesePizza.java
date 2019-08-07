package cn.abstractfactory;

import cn.abstractfactory.factory.PizzaIngredientFactory;
import cn.abstractfactory.product.Cheese;
import cn.abstractfactory.product.Clam;
import cn.abstractfactory.product.Dough;
import cn.abstractfactory.product.Peperoni;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza( PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Prepareing"+name);
        Cheese cheese = pizzaIngredientFactory.createCheese();
        Clam clam = pizzaIngredientFactory.createClam();
        Dough dough = pizzaIngredientFactory.createDough();
        Peperoni peperoni = pizzaIngredientFactory.createPeperoni();
    }
}
