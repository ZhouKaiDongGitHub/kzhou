package cn.test;

import cn.design.Duck;
import cn.design.MallardDuck;
import cn.design.RockDuck;
import cn.design.flayable.FlyLikeRock;
import cn.design.flayable.FlyNoWay;
import cn.observer.obervers.CurrentConditionDisplay;
import cn.observer.obervers.HeadIndexDisplay;
import cn.observer.obervers.StatisticsDisplay;
import cn.observer.subject.WeatherData;

public class Test {

    @org.junit.Test
    public void testRockDuck(){
        Duck duck = new RockDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
    @org.junit.Test
    public void testMallardDuck(){
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlayable(new FlyLikeRock());
        duck.performFly();
    }

    @org.junit.Test
    public void weatherStation(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay c = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay s = new StatisticsDisplay(weatherData);
        HeadIndexDisplay h = new HeadIndexDisplay(weatherData);
        weatherData.setMeasureData(50.0,80.0,900);
        weatherData.setMeasureData(52.0,79.0,920);
        //s.removeRegiser();
        weatherData.setMeasureData(53.0,84.0,820);
    }
}
