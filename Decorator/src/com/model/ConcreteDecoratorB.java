package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/4/20 9:32 PM
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
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
