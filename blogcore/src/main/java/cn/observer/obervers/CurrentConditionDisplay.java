package cn.observer.obervers;

import cn.observer.subject.Subject;
import cn.observer.subject.WeatherData;

public class CurrentConditionDisplay implements DisplayElement,Observer {

    private double temp;
    private double muti;
    private double pres;
    private WeatherData weatherData;

    public  CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerOberver(this);
    }
    @Override
    public void display() {
        System.out.println("第一布告板：目前的温度是"+temp+";湿度是"+muti);
    }

    @Override
    public void update(double temp, double humi, double pres) {
        this.temp = temp;
        this.muti = humi;
        this.pres = pres;
        display();
    }
}
