package com.my.demo;

/**
 * @Description TODO
 * @Author marshal
 * @Date 27/4/20 3:57 PM
 */
public abstract class Daily {
    protected boolean isWorkday = true;

    /**
     *  钩子方法
     *
     * @param isWorkday
     */
    protected void isWorkday(boolean isWorkday) {
        this.isWorkday = isWorkday;
    }


    /**
     *  起床（具体方法）
     */
    protected void getUp() {
        System.out.println("起床了 ～TAT～");
    }


    /**
     *  吃早饭（具体方法）
     */
    protected void haveBreakfast() {
        System.out.println("吃早餐了 ～OvO～");
    }

    /**
     * 出门（具体方法）
     */
    protected void byBus() {
        System.out.println("挤公交 ~TAT~");
    }

    /**
     * 抽象方法，由子类实现
     */
    protected abstract void doSomething();


    /**
     *  模板方法
     *
     */
    public final void template() {
        getUp();
        haveBreakfast();
        if (isWorkday) {
            byBus();
        }
        doSomething();
    }
}
