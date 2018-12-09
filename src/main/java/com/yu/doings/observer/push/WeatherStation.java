package com.yu.doings.observer.push;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {

    private List<Observer> observers = new ArrayList<>();

    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        notifyObserver(weather);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Weather weather) {
        for (Observer observer: observers) {
            observer.update(weather);
        }
    }
}
