package com.ymy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/5/20 3:29 PM
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void put(Variable variable, int value) {
        map.put(variable, value);
    }

    public int get(Variable variable) {
        return map.get(variable);
    }
}
