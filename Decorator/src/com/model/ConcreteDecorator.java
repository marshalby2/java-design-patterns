package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:19 AM
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
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
