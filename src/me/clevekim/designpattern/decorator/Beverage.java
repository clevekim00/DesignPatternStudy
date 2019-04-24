package me.clevekim.designpattern.decorator;

public abstract class Beverage {

    String desc;
    public String getDesc() {
        return desc;
    }

    public abstract int cost();
}
