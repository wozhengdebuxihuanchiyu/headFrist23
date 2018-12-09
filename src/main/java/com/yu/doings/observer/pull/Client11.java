package com.yu.doings.observer.pull;

/**
 * 拉模式
 *  将发布者的信息全部拉下来，需要什么取什么
 */
public class Client11 {
    public static void main(String[] args) {
        System.out.println("this is pull observer main");

        WeatherStation weatherStation = new WeatherStation();

        XiaoWangObserver xiaoWangObserver = new XiaoWangObserver();
        LaoLiObserver laoLiObserver = new LaoLiObserver();

        weatherStation.registerObserver(xiaoWangObserver);
        weatherStation.registerObserver(laoLiObserver);

        weatherStation.setTemperature(-20);
        weatherStation.setHumidity(30);
    }
}
