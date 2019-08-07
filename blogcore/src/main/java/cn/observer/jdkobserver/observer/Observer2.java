package cn.observer.jdkobserver.observer;

import cn.observer.jdkobserver.oberviable.WeatherData;
import cn.observer.obervers.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer, DisplayElement {
    private String result;
    private WeatherData weatherData;

    public Observer2(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("第二布告板：今天"+result);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            if(weatherData.getHumi()>80){
                result = "今天有雨";
            }else {
                result = "今天没雨";
            }
            display();
        }
    }
}
