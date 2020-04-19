package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 18/4/20 9:46 PM
 */
public class Client {
    public static void main(String[] args) {

        var shape1 = new Circle(new Red());
        shape1.show();   // This is Red Circle.
        var shape2 = new Circle(new Green());
        shape2.show();  // This is Green Circle.

        var shape3 = new Square(new Blue());
        shape3.show();  // This is Blue Square.

        var shape4 = new Triangle(new Blue());
        shape4.show();  // This is Blue Triangle.

    }
}
