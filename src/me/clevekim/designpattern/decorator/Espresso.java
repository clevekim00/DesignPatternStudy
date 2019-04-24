package me.clevekim.designpattern.decorator;

public class Espresso extends Beverage {

    private static final int ESPRESSO_COST = 1;

    @Override
    public String getDesc() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return ESPRESSO_COST;
    }
}
