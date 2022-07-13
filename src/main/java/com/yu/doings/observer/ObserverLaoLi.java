package com.yu.doings.observer;


/**
 * @author yuchangying
 * @date 2022-06-18 00:58:57
 * 观察者模式：
 * 1、抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 * 2、具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 * 3、抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
 * 4、具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 *
 * 此处为具体观察者,老李
 */
public class ObserverLaoLi implements Observer {
    /**
     * 订阅的气象站
     */
    WeatherStationSuject weatherStation;

    /**
     * 初始化气象站
     * @param weatherStation 气象站
     */
    public ObserverLaoLi(WeatherStationSuject weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        if(weatherStation.getHumidity() > 20){
            System.out.println("湿度大于20，老李打开了除湿器...");
        }
    }
}
