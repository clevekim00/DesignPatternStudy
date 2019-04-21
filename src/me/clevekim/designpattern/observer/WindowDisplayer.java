package me.clevekim.designpattern.observer;

public class WindowDisplayer implements IObserver {

    private WeatherStation weatherStation;
    public WindowDisplayer(WeatherStation ws) {
        this.weatherStation = ws;
    }

    @Override
    public void update() {
        WeatherModel model = this.weatherStation.getWeatherModel();

        System.out.println("WindowDisplayer:" + model);
    }
}
