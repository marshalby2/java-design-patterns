package com.my.model;

/**
 * @Description TODO
 * @Author marshal
 * @Date 15/5/20 4:50 PM
 */
public class Test {
    public static void main(String[] args) {

        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());

        os.accept(new ConcreteVisitorA());
        System.out.println("----------------------------");
        os.accept(new ConcreteVisitorB());


    }
}
