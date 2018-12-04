package com.yu.factory.factorymethod;

/**
 * 生产辣的食物的工厂
 */
public class LaFoodFactory implements IFoodFactory {
    //生产辣食物
    @Override
    public IFood getFood() {
        System.out.println("辣食物工厂生产了辣的食物...");
        return new LaFood();
    }
}
