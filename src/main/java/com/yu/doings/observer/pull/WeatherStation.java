package com.yu.doings.observer.pull;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {

    private List<Observer> observers = new ArrayList<>();



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    //温度
    private int temperature = 0;
    //湿度
    private int humidity = 0;


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObserver();
    }


    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }


}
