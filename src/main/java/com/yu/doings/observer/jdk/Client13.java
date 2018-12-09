package com.yu.doings.observer.jdk;

public class Client13 {

    public static void main(String[] args) {
        System.out.println("this is jdk observer main");

        WeatherStion weatherStion = new WeatherStion();

        XiaoWangObserver xiaoWangObserver = new XiaoWangObserver();
        weatherStion.addObserver(xiaoWangObserver);

        weatherStion.setTemperature(-10);
    }
}
