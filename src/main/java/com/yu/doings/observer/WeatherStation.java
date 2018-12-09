package com.yu.doings.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站，实现发布者接口
 */
public class WeatherStation implements  WeatherSubject{
    //需要有一个容量存储订阅者的信息
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        //订阅list加1
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //退订list减1
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        //通知：循环订阅者，调用订阅者的通知方法
        for(Observer observer: observerList){
            observer.update();
        }
    }

    //温度
    private int temperature = 0;
    //湿度
    private int humidity = 0;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        //发生改变通知
        notifyObserver();
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
        //发生改变通知
        notifyObserver();
    }


    public int getTemperature() {
        return temperature;
    }



    public int getHumidity() {
        return humidity;
    }


}
