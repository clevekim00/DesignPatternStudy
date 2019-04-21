package me.clevekim.designpattern.strategy;

import me.clevekim.designpattern.strategy.display.IDisplayBehavior;
import me.clevekim.designpattern.strategy.fly.IFlyBehavior;
import me.clevekim.designpattern.strategy.quack.IQuackBehavior;
import me.clevekim.designpattern.strategy.quack.NoQuack;

public class WildDuck extends Duck {

    public WildDuck(IQuackBehavior qb, IFlyBehavior fb, IDisplayBehavior db) {
        super(qb, fb, db);
    }
}
