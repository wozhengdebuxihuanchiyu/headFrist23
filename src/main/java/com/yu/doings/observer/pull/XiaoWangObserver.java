package com.yu.doings.observer.pull;

public class XiaoWangObserver implements Observer {
    @Override
    public void update(WeatherStation weatherStation) {
        if(weatherStation.getTemperature() < 0){
            System.out.println("小王穿上了羽绒服...");
        }
    }
}
