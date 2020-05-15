package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 4:07 PM
 */
public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "ConcreteElementB's operation";
    }
}
