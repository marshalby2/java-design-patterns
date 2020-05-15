package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 10:11 AM
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague a = new ConcreteColleagueA(mediator);
        Colleague b = new ConcreteColleagueB(mediator);
        Colleague c = new ConcreteColleagueC(mediator);

        mediator.register(a);
        mediator.register(b);
        mediator.register(c);

        a.send();
        System.out.println("-------------------------------------");
        b.send();
        System.out.println("-------------------------------------");
        c.send();

    }
}
