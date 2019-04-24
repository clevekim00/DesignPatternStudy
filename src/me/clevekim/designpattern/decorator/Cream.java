package me.clevekim.designpattern.decorator;

/**
 * DesignPatternStudy
 * <p>
 * Author: younghwan.kim
 * email : clevekim@naver.com
 * Date: 2019-04-24
 */
public class Cream extends AddOnDecorator {
    private static final int CREAM_COST = 2;

    private Beverage beverage;
    public Cream(Beverage beverage) {
        this.beverage = beverage;
        desc = "Cream";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + CREAM_COST;
    }

    @Override
    public String getDesc() {
        return String.format("%s + %s", this.beverage.getDesc(), desc);
    }
}
