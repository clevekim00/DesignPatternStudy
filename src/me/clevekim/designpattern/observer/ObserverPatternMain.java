package me.clevekim.designpattern.observer;

import java.security.SecureRandom;
import java.util.Random;

public class ObserverPatternMain {

    public static void main(String []args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplayer phoneDisplayer = new PhoneDisplayer(weatherStation);
        WindowDisplayer windowDisplayer = new WindowDisplayer(weatherStation);

        weatherStation.add(phoneDisplayer);
        weatherStation.add(windowDisplayer);

        for (int i = 0; i < 10; i++) {
            weatherStation.setWeatherModel(getWeatherModel());
            weatherStation.notifyToObserver();
        }
    }

    private static SecureRandom secureRandom = new SecureRandom();

    public static WeatherModel getWeatherModel() {
        WeatherModel weatherModel = new WeatherModel();
        weatherModel.setTemperature(secureRandom.nextDouble());
        weatherModel.setWeatherCondition(randomer.random());

        return weatherModel;
    }

    private static final RandomEnum<WeatherCondition> randomer = new RandomEnum<WeatherCondition>(WeatherCondition.class);

    private static class RandomEnum<E extends Enum<E>> {

        private static final Random RND = new Random();
        private final E[] values;

        public RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }

        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }
}
