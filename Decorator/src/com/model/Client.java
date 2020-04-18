package com.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 13/4/20 9:38 PM
 */
public class Client {
    public static void main(String[] args) {
        // 将被装饰的对象作为参数，传给具体的装饰器
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();
    }
}
