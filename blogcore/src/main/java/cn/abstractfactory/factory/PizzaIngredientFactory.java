package cn.abstractfactory.factory;

import cn.abstractfactory.product.*;

/**
 *
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();
    public Peperoni createPeperoni();
    public Veggies[] createVeggies();
}
