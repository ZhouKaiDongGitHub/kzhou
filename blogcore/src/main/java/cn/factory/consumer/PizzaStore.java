package cn.factory.consumer;

import cn.factory.Pizza;

/**
 * 工厂方法模式：定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到了子类。
 * OO思想 依赖倒置：依赖抽象，而不依赖具体类（高层依赖低层——低层和高层都依赖一个抽象）
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract  Pizza createPizza(String type);
}
