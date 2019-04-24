package me.clevekim.designpattern.decorator;

public class Caramel extends AddOnDecorator {
    private Beverage beverage;
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
}
