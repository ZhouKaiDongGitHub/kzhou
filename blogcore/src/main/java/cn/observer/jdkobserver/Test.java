package cn.observer.jdkobserver;

import cn.observer.jdkobserver.oberviable.WeatherData;
import cn.observer.jdkobserver.observer.Observer1;
import cn.observer.jdkobserver.observer.Observer2;


public class Test {

    @org.junit.Test
    public void testJdkObserver(){
        WeatherData weatherData = new WeatherData();
        Observer1 observer1 = new Observer1(weatherData);
        Observer2 observer2 = new Observer2(weatherData);
        weatherData.setMeasureData(50.0,81.0,600.0);
        weatherData.setMeasureData(49.0,79.0,650.0);
    }
}
