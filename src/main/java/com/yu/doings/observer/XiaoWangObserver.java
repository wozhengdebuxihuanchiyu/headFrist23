package com.yu.doings.observer;

/**
 * 订阅者1
 */
public class XiaoWangObserver implements Observer {

    WeatherStation weatherStation;

    public XiaoWangObserver(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if(weatherStation.getTemperature() < 0){
            System.out.println("小王穿上了羽绒服...");
        }
    }
}
