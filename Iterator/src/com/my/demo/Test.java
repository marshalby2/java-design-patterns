package com.my.demo;

import java.util.Iterator;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 2/5/20 3:54 PM
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
