package com.yu.create.singleton;

import com.yu.create.singleton.lazysingleton.InnerClassLazySingleton;

public class Client1 {

    public static void main(String[] args) {
        System.out.println("this is singleton main");
        //测试懒汉模式的多线程问题
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(InnerClassLazySingleton.getInstance());

            }
        }).start();
        System.out.println(InnerClassLazySingleton.getInstance());

        /*
        饿汉单例模式没有线程安全问题，但是比较耗费资源
        System.out.println(HugrySingleton.getHugrySingleton());
        System.out.println(HugrySingleton.getHugrySingleton());
        */
    }
}
