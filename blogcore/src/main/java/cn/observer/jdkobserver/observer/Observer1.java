package cn.observer.jdkobserver.observer;

import cn.observer.jdkobserver.oberviable.WeatherData;
import cn.observer.obervers.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer, DisplayElement {
    private double temp;
    private double muti;
    private double pres;
    private WeatherData weatherData;

    public Observer1(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.muti = weatherData.getHumi();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("第一布告板：目前的温度是"+temp+";湿度是"+muti);
    }
}
