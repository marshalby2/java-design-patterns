package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 28/4/20 5:40 PM
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
