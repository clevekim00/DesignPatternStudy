package me.clevekim.designpattern.observer;

public class PhoneDisplayer implements IObserver {

    private WeatherStation weatherStation;
    public PhoneDisplayer(WeatherStation ws) {
        this.weatherStation = ws;
    }

    @Override
    public void update() {
        WeatherModel model = weatherStation.getWeatherModel();

        System.out.println("PhoneDisplayer:" + model);
    }
}
