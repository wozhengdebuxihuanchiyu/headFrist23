package com.yu.factory.abstractfactory;

/**
 * 广东公司可以生产食物和香烟，但是食物只能是甜的，香烟只能是女士的
 */
public class GuangdongFactory implements IFactory {

    @Override
    public IFood getFood() {
        System.out.println("广东公司生产了甜的食物..");
        return new TianFood();
    }

    @Override
    public ISomke getSomke() {
        System.out.println("广东公司成产了女士香烟..");
        return new WomanSomke();
    }
}
