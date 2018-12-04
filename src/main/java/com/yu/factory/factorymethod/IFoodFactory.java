package com.yu.factory.factorymethod;

/**
 * 食物生产工厂
 *
 */
public interface IFoodFactory {
    //生产食物
    IFood getFood();
}
