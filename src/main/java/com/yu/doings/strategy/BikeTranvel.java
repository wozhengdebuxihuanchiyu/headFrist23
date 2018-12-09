package com.yu.doings.strategy;

/**
 * 一种出行策略，自行车出行
 */
public class BikeTranvel implements Tranvel {
    @Override
    public void tranvel() {
        System.out.println("自行车出行！");
    }
}
