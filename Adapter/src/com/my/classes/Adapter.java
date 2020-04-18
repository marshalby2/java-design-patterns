package com.my.classes;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:36 AM
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void targetMethod() {
        // 调用被适配者的方法
        super.adapteeMethod();
        System.out.println("This is target method.");
    }
}
