package com.yu.structure.adpter.classadpter;

/**
 * 使用类
 *  笔记本电脑需要的是5V电压，但是现在原系统提供的是220V电压
 */
public class NootBook {

    public void powerOn(Power5V power5V){
        power5V.getPower5V();
        System.out.println("笔记本得到5V电压，正在开机...");
    }
}
