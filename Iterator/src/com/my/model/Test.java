package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/5/20 4:27 PM
 */
public class Test {
    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("first");
        aggregate.add(123);
        aggregate.add(170.2f);

        System.out.println(aggregate.size());
        System.out.println(aggregate.get(0));

        System.out.println("===============iterator=============");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
