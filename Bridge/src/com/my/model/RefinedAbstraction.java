package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 7:19 PM
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        // code
        implementor.operationImpl();
        // code
    }
}
