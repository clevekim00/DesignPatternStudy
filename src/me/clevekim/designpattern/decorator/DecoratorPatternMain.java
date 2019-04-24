package me.clevekim.designpattern.decorator;

public class DecoratorPatternMain {

    public static void main(String []args) {
        Beverage beverage = new Espresso();
        beverage = new Caramel(beverage);
        beverage = new Cream(beverage);
        System.out.println("Order:" + beverage.getDesc() +  ". Cost:"  + beverage.cost());
    }
}
