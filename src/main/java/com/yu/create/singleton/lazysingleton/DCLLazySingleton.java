package com.yu.create.singleton.lazysingleton;

/**
 * 双重校验锁机制，解决懒汉单例模式的线程不安全问题
 *
 * @see LazySingleton
 */
public class DCLLazySingleton {

    private static DCLLazySingleton dclLazySingleton;

    private DCLLazySingleton(){}

    public static DCLLazySingleton getDclLazySingleton(){
        //双重校验锁机制
        if(dclLazySingleton == null){
            //加锁
            synchronized (DCLLazySingleton.class){
                //再校验一次
                if(dclLazySingleton == null){
                    dclLazySingleton = new DCLLazySingleton();
                }
            }
        }
        return dclLazySingleton;
    }
}
