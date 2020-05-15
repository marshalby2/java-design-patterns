package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 10:08 AM
 */
public class ConcreteColleagueC extends Colleague{

    public ConcreteColleagueC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive() {
        System.out.println("ConcreteColleagueC receive.");
    }

    @Override
    public void send() {
        System.out.println("ConcreteColleagueC send.");
        mediator.relay(this);
    }
}
