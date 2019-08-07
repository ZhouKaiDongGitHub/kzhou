package cn.observer.jdkobserver.oberviable;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
    private double temp;
    private double humi;
    private double pres;
    public WeatherData(){

    }

    public void meatureChange(){
        setChanged();
        notifyObservers();
    }

    public void setMeasureData(double temp1,double humi1,double pres1){
        temp = temp1;
        humi = humi1;
        pres = pres1;
        meatureChange();
    }

    public double getTemp() {
        return temp;
    }

    public double getHumi() {
        return humi;
    }

    public double getPres() {
        return pres;
    }
}
