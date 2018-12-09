package com.yu.doings.strategy;

/**
 * 一种出行方式，飞机出行
 */
public class AirPlanceTranvel implements Tranvel {

    @Override
    public void tranvel() {
        System.out.println("飞机出行!");
    }
}
