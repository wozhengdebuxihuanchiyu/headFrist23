package com.yu.structure.adpter.classadpter;


/**
 * 增加的适配器类
 *  作用：将220V电压转换成5V电压
 */
public class PowerAdpter extends Power220v implements Power5V{
    @Override
    public void getPower5V() {
        //获取原有系统的220V电压
        super.getPower220V();

        transform220Vto5V();
        System.out.println("正在输出5V电压...");
    }

    private void transform220Vto5V(){
        System.out.println("正在将220V电压转化成5V电压..");
    }
}
