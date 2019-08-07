package cn.observer.obervers;

import cn.observer.subject.WeatherData;

public class HeadIndexDisplay implements DisplayElement,Observer {

    private double heatIndex;
    private WeatherData weatherData;

    public HeadIndexDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerOberver(this);
    }
    @Override
    public void display() {
        System.out.println("当前酷热指数为:"+heatIndex);
    }

    @Override
    public void update(double temp, double humi, double pres) {
        heatIndex = computeHeatIndex(temp,humi);
        display();
    }

    private double computeHeatIndex(double t, double rh) {
        double index = (double)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
}
