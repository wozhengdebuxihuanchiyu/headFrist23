package com.yu.create.factory.factorymethod;

/**
 * 食物的一种：甜的食物
 */
public class TianFood  implements IFood{

    @Override
    public void eat() {
        System.out.println("吃了甜的食物...");
    }
}
