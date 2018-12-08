package com.yu.create.singleton.hugrysingleton;

/**
 * 饿汉单例模式：一进来就创建需要创建的对象，感觉很饿
 */
public class HugrySingleton {

    private static HugrySingleton hugrySingleton = new HugrySingleton();

    private HugrySingleton(){ }


    public static  HugrySingleton getHugrySingleton(){
        return hugrySingleton;
    }
}
