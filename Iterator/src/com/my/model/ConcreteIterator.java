package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/5/20 3:58 PM
 */
public class ConcreteIterator implements Iterator {

    private int index = 0; // index of next element to return

    private List<Object> list;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return hasNext() ? list.get(index++) : null;
    }
}
