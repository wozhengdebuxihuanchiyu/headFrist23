package com.yu.doings.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class XiaoWangObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherStion weatherStion = (WeatherStion) o;
        if(weatherStion.getTemperature() < 0){
            System.out.println("小王穿上了羽绒服...");
        }
    }
}
