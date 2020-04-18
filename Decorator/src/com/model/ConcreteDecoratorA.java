package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/4/20 9:32 PM
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        addFunction();
        super.operation();
    }

    public void addFunction() {
        System.out.println("add something.");
    }
}
