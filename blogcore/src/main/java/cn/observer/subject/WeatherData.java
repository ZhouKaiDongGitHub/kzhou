package cn.observer.subject;

import cn.observer.obervers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private double temp;
    private double humi;
    private double pres;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }
    @Override
    public void registerOberver(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void removeOberver(Observer ob) {
        int i = observerList.indexOf(ob);
        if(i>=0){
            observerList.remove(i);
        }
    }

    @Override
    public void notifyOberver() {
        for (int i = 0;i< observerList.size();i++){
            Observer observer = observerList.get(i);
            observer.update(temp,humi,pres);
        }
    }
    public void meatureChange(){
        notifyOberver();
    }

    public void setMeasureData(double temp1,double humi1,double pres1){
        temp = temp1;
        humi = humi1;
        pres = pres1;
        meatureChange();
    }
}
