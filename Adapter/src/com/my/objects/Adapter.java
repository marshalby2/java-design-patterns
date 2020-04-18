package com.my.objects;

import com.my.classes.Adaptee;
import com.my.classes.Target;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:44 AM
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
        System.out.println("This is target method.");
    }
}
