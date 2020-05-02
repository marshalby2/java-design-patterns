package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/5/20 4:23 PM
 */
public class ConcreteAggregate implements Aggregate{

    private List<Object> list = new ArrayList<>();

    @Override
    public void add(Object o) {
        list.add(o);
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
