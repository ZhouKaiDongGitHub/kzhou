package cn.decoration.decorator;

import cn.decoration.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescripe() {
        return beverage.getDescripe()+",Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public double cast() {
        //return beverage.cast() + 0.2;
        if(getSize()==Beverage.TALL){
            return  beverage.cast()+0.2+0.5;
        }else if(getSize()==Beverage.GRANDE){
            return  beverage.cast()+0.2+1.0;
        }else if(getSize()==Beverage.VENTI){
            return  beverage.cast()+0.2+1.5;
        }else {
            return beverage.cast()+0.2;
        }
    }
}
