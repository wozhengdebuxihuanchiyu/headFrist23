package com.yu.doings.observer;

public class Client10 {
    public static void main(String[] args) {
        System.out.println("this is observer main");

        WeatherStation weatherStation = new WeatherStation();

        XiaoWangObserver xiaoWangObserver = new XiaoWangObserver(weatherStation);
        LaoLiObserver laoLiObserver = new LaoLiObserver(weatherStation);

        weatherStation.registerObserver(xiaoWangObserver);
        weatherStation.registerObserver(laoLiObserver);

        weatherStation.setTemperature(20);
        weatherStation.setTemperature(-20);
        weatherStation.setHumidity(50);
    }
}
