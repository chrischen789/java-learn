package com.chrischen.designpattern.observer.subject;

import com.chrischen.designpattern.observer.ob.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List observers = new ArrayList();

    private float temperature;

    private float humidity;

    private float pressure;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int target = observers.indexOf(observer);
        if (target > -1) {
            observers.remove(target);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObserver();
    }
}
