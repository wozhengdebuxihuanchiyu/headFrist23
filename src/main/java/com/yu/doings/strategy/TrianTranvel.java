package com.yu.doings.strategy;

/**
 * 一种出行策略，火车出行
 */
public class TrianTranvel implements Tranvel {
    @Override
    public void tranvel() {
        System.out.println("火车出行!");
    }
}
