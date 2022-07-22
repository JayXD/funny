package com.dxj.ffx.refacotr.observer.java;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
    }


    public void rain() {
        this.temperature = 1;
        this.humidity = 2;
        this.pressure = 3;
        measurementChanged();
    }

    private void measurementChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
