package com.my.classes;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:38 AM
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.targetMethod();
    }
}
