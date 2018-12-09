package com.yu.doings.observer.push;

public interface WeatherSubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Weather weather);
}
