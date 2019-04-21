package me.clevekim.designpattern.strategy.display;

public class TextDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("TEXT");
    }
}
