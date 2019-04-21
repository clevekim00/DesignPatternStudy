package me.clevekim.designpattern.observer;

public interface IObservable {

    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyToObserver();
}
