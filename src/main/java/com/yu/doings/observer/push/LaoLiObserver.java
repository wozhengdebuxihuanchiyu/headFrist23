package com.yu.doings.observer.push;

public class LaoLiObserver implements Observer {
    @Override
    public void update(Weather weather) {
        if(weather.getHumidity() > 20){
            System.out.println("老李开始除湿...");
        }
    }
}
