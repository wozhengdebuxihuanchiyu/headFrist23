package com.yu.doings.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuchangying
 * @date 2022-06-18 00:58:57
 * 观察者模式：
 * 1、抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * 2、具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 * 3、抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
 * 4、具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 *
 * 此处为具体主题，气象站
 */
public class WeatherStationSuject implements  WeatherSubject{

    /**
     * 存储所有的观察者（订阅者）
     */
    List<Observer> observerList = new ArrayList<>();
    /**
     * 气象站播报的温度
     */
    private int temperature = 0;
    /**
     * 气象站播报的湿度
     */
    private int humidity = 0;

    /**
     * 温度发生改变
     * @param temperature 温度
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        //发生改变通知
        notifyObserver();
    }

    /**
     * 湿度发生改变
     * @param humidity 湿度
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
        //发生改变通知
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        //订阅list加1
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //退订list减1
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        //通知：循环订阅者，调用订阅者的通知方法
        for(Observer observer: observerList){
            observer.update();
        }
    }

    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }
}
