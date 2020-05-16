package com.ymy.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 16/5/20 3:34 PM
 */
public class Division implements ArithmeticExpression{

    private ArithmeticExpression exp1;
    private ArithmeticExpression exp2;

    public Division(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpret(Context context) {
        return (exp2.interpret(context) == 0) ? -1 : (exp1.interpret(context) / exp2.interpret(context));
    }
}
