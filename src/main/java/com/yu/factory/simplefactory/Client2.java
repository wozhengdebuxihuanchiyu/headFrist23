package com.yu.factory.simplefactory;

import com.yu.factory.simplefactory.IFood;
import com.yu.factory.simplefactory.SimpleFactory;


public class Client2 {

    public static void main(String[] args) {
        System.out.println("this is factory main");

        SimpleFactory simpleFactory = new SimpleFactory();

        IFood iFood = simpleFactory.getIFood("xxx");

        if(iFood != null){
            iFood.eat();
        }
    }
}
