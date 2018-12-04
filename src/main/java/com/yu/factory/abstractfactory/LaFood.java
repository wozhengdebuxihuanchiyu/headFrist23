package com.yu.factory.abstractfactory;

/**
 * 食物的一种：辣的食物
 */
public class LaFood implements IFood {
    @Override
    public void eat() {
        System.out.println("吃了辣的食物..");
    }
}
