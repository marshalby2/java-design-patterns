package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/4/20 5:00 PM
 */
public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
