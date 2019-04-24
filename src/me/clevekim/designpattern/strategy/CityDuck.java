package me.clevekim.designpattern.strategy;

import me.clevekim.designpattern.strategy.display.IDisplayBehavior;
import me.clevekim.designpattern.strategy.fly.IFlyBehavior;
import me.clevekim.designpattern.strategy.fly.NoFly;
import me.clevekim.designpattern.strategy.quack.IQuackBehavior;

public class CityDuck extends Duck {

    public CityDuck(IQuackBehavior qb, IFlyBehavior fb, IDisplayBehavior db) {

        super(qb, fb, db);
    }
}
