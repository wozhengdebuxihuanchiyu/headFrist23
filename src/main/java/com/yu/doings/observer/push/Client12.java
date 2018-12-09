package com.yu.doings.observer.push;

/**
 * 推模式
 *  发布者固定推送一个对象给订阅者
 */
public class Client12 {
    public static void main(String[] args) {
        System.out.println("this is push observer main");

        WeatherStation weatherStation = new WeatherStation();

        XiaoWangObserver xiaoWangObserver = new XiaoWangObserver();
        LaoLiObserver laoLiObserver = new LaoLiObserver();

        weatherStation.registerObserver(xiaoWangObserver);
        weatherStation.registerObserver(laoLiObserver);

        Weather weather = new Weather();
        weather.setTemperature(-10);
        weatherStation.setWeather(weather);

        weather.setHumidity(30);
        weatherStation.setWeather(weather);
    }
}
