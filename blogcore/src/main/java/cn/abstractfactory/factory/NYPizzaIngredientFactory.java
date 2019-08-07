package cn.abstractfactory.factory;

import cn.abstractfactory.product.*;
import cn.abstractfactory.product.veggies.Garlic;
import cn.abstractfactory.product.veggies.Mushroom;
import cn.abstractfactory.product.veggies.Onion;
import cn.abstractfactory.product.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinarSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggiCheese();
    }

    @Override
    public Clam createClam() {
        return new FraseClam();
    }

    @Override
    public Peperoni createPeperoni() {
        return new SlicedPeperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] ={new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }
}
