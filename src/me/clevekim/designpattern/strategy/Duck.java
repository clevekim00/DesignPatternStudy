package me.clevekim.designpattern.strategy;

import me.clevekim.designpattern.strategy.display.IDisplayBehavior;
import me.clevekim.designpattern.strategy.fly.IFlyBehavior;
import me.clevekim.designpattern.strategy.fly.SimpleFly;
import me.clevekim.designpattern.strategy.quack.IQuackBehavior;
import me.clevekim.designpattern.strategy.quack.SimpleQuack;

public class Duck {

    IQuackBehavior quackBehavior;
    IFlyBehavior flyBehavior;
    IDisplayBehavior displayBehavior;

    public Duck(IQuackBehavior qb, IFlyBehavior fb, IDisplayBehavior db) {
        this.quackBehavior = qb;
        this.flyBehavior = fb;
        this.displayBehavior = db;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performDisplay() {
        displayBehavior.display();
    }
}
