package com.yu.doings.observer.pull;

public class LaoLiObserver implements Observer {
    @Override
    public void update(WeatherStation weatherStation) {
        if(weatherStation.getHumidity() > 20){
            System.out.println("老李开始除湿...");
        }
    }
}
