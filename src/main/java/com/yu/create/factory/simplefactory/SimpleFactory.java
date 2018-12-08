package com.yu.create.factory.simplefactory;

/**
 * 工厂类，用于生产食物
 *
 */
public class SimpleFactory {

    //根据食物名生产食物
    public IFood getIFood(String name){
        switch (name){
            case "shutiao":
                return new ShuTiao();
            case "zhaji":
                return new ZhaJi();

                default:
                    System.out.println("不能生产这中食物..");
                   return null;

        }
    }
}
