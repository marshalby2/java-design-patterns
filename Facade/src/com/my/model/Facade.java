package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 5:36 PM
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void methodA() {
        subSystemA.method();
    }

    public void methodB() {
        subSystemB.method();
    }
    public void methodC() {
        subSystemC.method();
    }

}
