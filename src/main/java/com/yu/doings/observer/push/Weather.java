package com.yu.doings.observer.push;

public class Weather {
    //温度
    private int temperature = 0;
    //湿度
    private int humidity = 0;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
