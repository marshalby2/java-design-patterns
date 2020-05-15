package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 10:02 AM
 */
public class ConcreteMediator implements Mediator{

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        colleagues.stream()
                .filter(e -> !e.equals(colleague))
                .forEach(Colleague::receive);
    }
}
