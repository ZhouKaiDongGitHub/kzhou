package cn.decoration.decorator;

import cn.decoration.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescripe() {
        return beverage.getDescripe()+",Milk";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        if(getSize()==Beverage.TALL){
            return  beverage.cast()+0.22+0.5;
        }else if(getSize()==Beverage.GRANDE){
            return  beverage.cast()+0.22+1.0;
        }else if(getSize()==Beverage.VENTI){
            return  beverage.cast()+0.22+1.5;
        }else {
           return beverage.cast()+0.22;
        }
    }
}
