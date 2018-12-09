package com.yu.doings.observer;

public class LaoLiObserver implements Observer {
    WeatherStation weatherStation;

    public LaoLiObserver(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        if(weatherStation.getHumidity() > 20){
            System.out.println("小李打开了除湿器...");
        }
    }
}
