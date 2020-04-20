package com.my.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author marshal
 * @Date 19/4/20 9:29 PM
 */
public class FlyweightFactory {

    private static Map<String, Flyweight> pool = new HashMap<>();

    private FlyweightFactory() {}

    public static Flyweight getFlyweight(String key) {
        var instance = pool.get(key);

        if (instance == null) {
            instance = new ConcreteFlyweight(key);
            pool.put(key, instance);
        }
        return instance;
    }
}
