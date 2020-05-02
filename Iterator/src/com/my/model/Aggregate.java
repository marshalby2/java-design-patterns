package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/5/20 4:22 PM
 */
public interface Aggregate {

    void add(Object o);

    int size();

    Object get(int index);

    Iterator iterator();

}
