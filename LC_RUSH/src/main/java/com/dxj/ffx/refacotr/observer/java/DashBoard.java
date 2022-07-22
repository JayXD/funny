package com.dxj.ffx.refacotr.observer.java;

import java.util.Observable;
import java.util.Observer;

public class DashBoard implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    private Observable observable;

    public DashBoard(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.observable = o;
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("看板:DashBoard{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
