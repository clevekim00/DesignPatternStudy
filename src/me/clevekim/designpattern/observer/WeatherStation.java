package me.clevekim.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private List<IObserver> observers;
    private WeatherModel weatherModel;
    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyToObserver() {
        this.observers.forEach(observer -> observer.update());
    }

    public WeatherModel getWeatherModel() {
        return this.weatherModel;
    }

    public void setWeatherModel(WeatherModel weatherModel) {
        this.weatherModel = weatherModel;
    }
}
