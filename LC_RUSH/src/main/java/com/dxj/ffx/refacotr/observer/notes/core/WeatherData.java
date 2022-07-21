package com.dxj.ffx.refacotr.observer.notes.core;

import com.dxj.ffx.refacotr.observer.notes.observers.Observer;
import com.dxj.ffx.refacotr.observer.notes.observers.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public void rain() {
        this.temperature = 1;
        this.humidity = 2;
        this.pressure = 3;
        measurementChanged();
    }

    private void measurementChanged() {
        List<Float> param = new ArrayList<>(); // 随便写写了
        param.add(temperature);
        param.add(humidity);
        param.add(pressure);
        this.notifyObservers(param);
    }

    @Override
    public void notifyObservers(Object obj) {
        observers.forEach(observer -> observer.update(this, obj));
    }

    @Override
    public void assignObservers(Observer observer) {
        synchronized (this) {
            if (this.observers == null) {
                this.observers = new ArrayList<>();
            }
        }
        this.observers.add(observer);
    }
}
