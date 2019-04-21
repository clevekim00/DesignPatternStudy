package me.clevekim.designpattern.strategy.quack;

public class SimpleQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("SimpleQuack");
    }
}
