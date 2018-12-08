package com.yu.create.factory.factorymethod;

/**
 * 甜食物工厂：生产甜的食物
 */
public class TianFoodFactory implements IFoodFactory{

    //生产甜食物
    @Override
    public IFood getFood() {
        System.out.println("生产了甜的食物...");
        return new TianFood();
    }
}
