package com.yu.doings.observer.push;

public class XiaoWangObserver implements Observer {
    @Override
    public void update(Weather weather) {
        if (weather.getTemperature() < 0 ){
            System.out.println("小王穿上了羽绒服...");
        }
    }
}
