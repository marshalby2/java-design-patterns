package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 10:08 AM
 */
public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteColleagueB receive.");
    }

    @Override
    public void send() {
        System.out.println("ConcreteColleagueB send.");
        mediator.relay(this);
    }
}
