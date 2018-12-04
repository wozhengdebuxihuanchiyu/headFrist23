package com.yu.factory.factorymethod;

public class Client3 {
    public static void main(String[] args) {
        System.out.println("this is factory method main");

        //生产不同种食物，不要改别的代码，只改这里new出来的类
        //IFoodFactory iFoodFactory = new LaFoodFactory();
        IFoodFactory iFoodFactory = new TianFoodFactory();
        IFood food = iFoodFactory.getFood();
        food.eat();

    }
}
