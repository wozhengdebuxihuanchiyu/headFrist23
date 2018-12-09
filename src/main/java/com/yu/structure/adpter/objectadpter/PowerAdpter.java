package com.yu.structure.adpter.objectadpter;

/**
 * 适配器类，现有将原有的220V电压转换成5V电压
 *  对象适配器，使用组合将原有系统的功能集成进来
 *
 */
public class PowerAdpter implements Power5V{

    //组合集成
    private Power220V power220V;
    //构造器初始化
    public PowerAdpter(Power220V power220V){
        this.power220V = power220V;
    }

    @Override
    public void getPower5V() {
        power220V.getPower220V();
        transform220Vto5V();
        System.out.println("正在输出5V电压...");
    }

    private void transform220Vto5V(){
        System.out.println("正在将220V电压转换成5V电压...");
    }
}
