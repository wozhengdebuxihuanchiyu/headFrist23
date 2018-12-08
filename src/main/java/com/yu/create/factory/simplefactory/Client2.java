package com.yu.create.factory.simplefactory;


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
