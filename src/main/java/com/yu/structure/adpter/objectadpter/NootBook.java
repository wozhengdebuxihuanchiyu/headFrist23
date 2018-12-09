package com.yu.structure.adpter.objectadpter;

/**
 * 笔记本电脑开机需要5V电压
 */
public class NootBook {
    public void powerOn(Power5V power5V){
        power5V.getPower5V();
        System.out.println("笔记本电脑获得了5V电压，正在开机....");
    }
}
