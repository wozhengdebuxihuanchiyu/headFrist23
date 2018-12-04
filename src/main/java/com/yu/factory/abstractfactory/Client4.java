package com.yu.factory.abstractfactory;

public class Client4 {
    public static void main(String[] args) {

        System.out.println("this is abstract factory main");

        IFactory iFactory = new GuangdongFactory();
        IFood food = iFactory.getFood();
        food.eat();
        ISomke somke = iFactory.getSomke();
        somke.somking();

    }
}
