package me.clevekim.designpattern.strategy;

import me.clevekim.designpattern.strategy.display.NoDisplay;
import me.clevekim.designpattern.strategy.display.TextDisplay;
import me.clevekim.designpattern.strategy.fly.NoFly;
import me.clevekim.designpattern.strategy.fly.SimpleFly;
import me.clevekim.designpattern.strategy.quack.NoQuack;
import me.clevekim.designpattern.strategy.quack.SimpleQuack;

public class PatternMain {

    public static void main(String[] args) {

        Duck wildDuck = new WildDuck(new SimpleQuack(), new SimpleFly(), new TextDisplay());
        wildDuck.performFly();
        wildDuck.performQuack();
        wildDuck.performDisplay();

        Duck cityDuck = new CityDuck(new NoQuack(), new NoFly(), new NoDisplay());
        cityDuck.performFly();
        cityDuck.performQuack();
        cityDuck.performDisplay();
    }
}
