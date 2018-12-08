package com.yu.create.factory.abstractfactory;

/**
 * 工厂接口，这个工厂可以生产食物，也可以生产香烟
 */
public interface IFactory {
    //生产食物
    IFood getFood();
    //生产香烟
    ISomke getSomke();
}
