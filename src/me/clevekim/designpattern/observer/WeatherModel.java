package me.clevekim.designpattern.observer;

public class WeatherModel {

    private double temperature;

    private WeatherCondition weatherCondition;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    @Override
    public String toString() {
        return String.format("temperature:%s, condition:%s", this.getTemperature(), this.getWeatherCondition());
    }
}
