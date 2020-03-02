package com.chrischen.designpattern.strategy;

import com.chrischen.designpattern.observer.ob.CurrentConditionsDisplay;
import com.chrischen.designpattern.observer.subject.WeatherData;
import org.junit.Test;


public class ObserverTest {

    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.measurementsChanged(24, 51, 1.1f);

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.measurementsChanged(24, 51, 1.1f);

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.measurementsChanged(22, 53, 1.0f);
    }

}
