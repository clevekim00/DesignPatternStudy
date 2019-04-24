package me.clevekim.designpattern.decorator;

public class Caramel extends AddOnDecorator {

    public static final int CARAMEL_COST = 2;

    private Beverage beverage;
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
        desc = "Caramel";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + CARAMEL_COST;
    }

    @Override
    public String getDesc() {
        return String.format("%s + %s", this.beverage.getDesc(), desc);
    }
}
