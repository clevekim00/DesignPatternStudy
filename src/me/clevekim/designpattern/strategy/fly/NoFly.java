package me.clevekim.designpattern.strategy.fly;

public class NoFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("NoFly");
    }
}
