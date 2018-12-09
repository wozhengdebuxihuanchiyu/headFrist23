package com.yu.doings.strategy;

/**
 * 人可以选择多种出行方式
 *  将出行的接口组合进人的对象里，人就可以随意的选择出行方式，只要这个出行方式是出行接口的实现类
 */
public class Person {

    private Tranvel tranvel;

    public Person(Tranvel tranvel){
        this.tranvel = tranvel;
    }

    public void tranvel(){
        tranvel.tranvel();
    }
}
