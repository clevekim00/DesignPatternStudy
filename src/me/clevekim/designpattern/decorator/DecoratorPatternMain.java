package me.clevekim.designpattern.decorator;

public class DecoratorPatternMain {

    public static void main(String []args) {
        Beverage beverage = new Caramel(new Espresso());
        System.out.println("Cost:"  + beverage.cost());
    }
}
