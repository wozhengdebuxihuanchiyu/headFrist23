package com.yu.doings.observer.jdk;

import java.util.Observable;

public class WeatherStion extends Observable {

    //温度
    private int temperature = 0;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        //调用改变方法
        setChanged();
        //通知订阅者
        notifyObservers();
    }
}
