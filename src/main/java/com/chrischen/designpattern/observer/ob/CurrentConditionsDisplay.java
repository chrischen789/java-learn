package com.chrischen.designpattern.observer.ob;

import com.chrischen.designpattern.observer.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static final Logger log = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private Subject weatherData;

    private float temp;

    private float humidity;

    private float pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = humidity;
        this.display();
    }

    @Override
    public void display() {
        log.info("今天的天气情况，温度：{}，湿度：{}，气压：{}", this.temp, this.humidity, this.pressure);
    }


}
