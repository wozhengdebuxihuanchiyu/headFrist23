package com.yu.doings.strategy;

public class Client14 {
    public static void main(String[] args) {
        System.out.println("this is strategy main");

        Tranvel tranvel = new TrianTranvel();
        Person person = new Person(tranvel);
        person.tranvel();

    }
}
