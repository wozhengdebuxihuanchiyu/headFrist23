package com.yu.doings.observer.pull;

public interface WeatherSubject {


    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
