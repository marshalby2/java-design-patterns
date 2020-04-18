package com.my.advance;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 11:25 AM
 */
public class PersonTest {
    public static void main(String[] args) {
        Person tom = Person.builder()
                .name("Tom")
                .age(20)
                .gender("Male")
                .height(172.4f)
                .nation("America")
                .build();
        System.out.println(tom); // Person{name='Tom', gender='Male', age=20, nation='America'}
    }
}
