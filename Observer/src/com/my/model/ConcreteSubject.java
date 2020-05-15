package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 2:47 PM
 */
public class ConcreteSubject implements Subject {

    public List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        if (!observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::response);
    }

    public void update() {
        System.out.println("----- subject update -----");
        this.notifyObservers();
    }
}
