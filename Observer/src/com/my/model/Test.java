package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 2:50 PM
 */
public class Test {
    public static void main(String[] args) {
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();

        ConcreteSubject subject = new ConcreteSubject();
        subject.add(observerA);
        subject.add(observerB);

        subject.update();
    }
}
