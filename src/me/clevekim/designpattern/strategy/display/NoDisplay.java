package me.clevekim.designpattern.strategy.display;

public class NoDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("NO");
    }
}
