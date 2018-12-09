package com.yu.doings.observer;

/**
 * 发布者接口
 *  注册
 *  移除
 *  通知
 */
public interface WeatherSubject {
    //订阅
    void registerObserver(Observer observer);
    //退订、移除
    void removeObserver(Observer observer);
    //通知
    void notifyObserver();
}
