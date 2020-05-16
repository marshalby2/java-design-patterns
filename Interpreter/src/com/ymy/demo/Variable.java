package com.ymy.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/5/20 3:30 PM
 */
public class Variable implements ArithmeticExpression{
    @Override
    public int interpret(Context context) {
        return context.get(this);
    }
}
