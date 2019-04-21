package me.clevekim.designpattern.strategy.fly;

public class SimpleFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("SimpleFly");
    }
}
