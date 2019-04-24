package me.clevekim.designpattern.decorator;

/**
 * Author: younghwan.kim
 * Date: #date
 */
public class DripCoffee extends Beverage {

    private static final int DRIPCOFFEE_COST = 1;

    @Override
    public String getDesc() {
        return "CripConffee";
    }

    @Override
    public int cost() {
        return DRIPCOFFEE_COST;
    }
}
