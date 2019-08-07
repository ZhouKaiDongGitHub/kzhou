package cn.decoration.decorator;

import cn.decoration.Beverage;

public class Soy extends  CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescripe() {
        return beverage.getDescripe()+",Soy";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        //return beverage.cast()+0.15;
        if(getSize()==Beverage.TALL){
            return  beverage.cast()+0.15+0.5;
        }else if(getSize()==Beverage.GRANDE){
            return  beverage.cast()+0.15+1.0;
        }else if(getSize()==Beverage.VENTI){
            return  beverage.cast()+0.15+1.5;
        }else {
            return beverage.cast()+0.15;
        }
    }
}
