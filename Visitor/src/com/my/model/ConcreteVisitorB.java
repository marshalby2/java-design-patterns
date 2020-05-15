package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 4:06 PM
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("visitorB visit: " + element.operation());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("visitorB visit: " + element.operation());
    }
}
