package cn.observer.obervers;

import cn.observer.subject.WeatherData;

public class StatisticsDisplay implements DisplayElement,Observer {

    private String result;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerOberver(this);
    }
    public void removeRegiser(){
        weatherData.removeOberver(this);
    }
    @Override
    public void display() {
        System.out.println("第二布告板：今天"+result);
    }

    @Override
    public void update(double temp, double humi, double pres) {
        if(humi<80){
            result = "预计有雨";
        }else {
            result = "预计没雨";
        }
        display();
    }
}
