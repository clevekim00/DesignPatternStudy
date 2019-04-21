package me.clevekim.designpattern.strategy.quack;

public class NoQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("NoQuack");
    }
}
