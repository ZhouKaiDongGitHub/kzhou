package cn.abstractfactory;

import cn.abstractfactory.product.*;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Peperoni peperoni;
    Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough.toString() + "\n");
        display.append(sauce.toString() + "\n");
        display.append(cheese.toString() + "\n");
        display.append(peperoni.toString() + "\n");
        display.append(clam.toString() + "\n");
        for (int i = 0; i < veggies.length; i++) {
            display.append((String ) veggies[i].toString() + "\n");
        }
        return display.toString();
    }
}
