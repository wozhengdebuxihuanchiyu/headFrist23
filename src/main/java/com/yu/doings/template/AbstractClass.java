package com.yu.doings.template;

/**
 * @author yuchangying
 * @date 2022-06-18 15:38:46
 * 模板方法模式：
 * 1、抽象类/抽象模板（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 * 2、具体子类/具体实现（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤。
 *
 * 此处为——抽象类/抽象模板
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod(){
        commonMethod();
        abstractMethod1();
        abstractMethod2();
    }

    /**
     * 需要大家一起执行的方法
     */
    public void commonMethod(){
        System.out.println("大家一起执行的方法");
    }

    /**
     * 抽象方法1，需要具体的类实现
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2，需要具体的类实现
     */
    public abstract void abstractMethod2();
}
