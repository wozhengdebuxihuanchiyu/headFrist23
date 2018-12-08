package com.yu.create.singleton.lazysingleton;

/**
 * 静态内部类解决懒汉模式的线程不安全问题
 *
 * @see LazySingleton
 */
public class InnerClassLazySingleton {

    //使用java的类加载器，保证线程安全
    public static class LazySingletonHolder{
        private static final InnerClassLazySingleton innerClassLazySingleton = new InnerClassLazySingleton();
    }

    private InnerClassLazySingleton(){}

    public static InnerClassLazySingleton getInstance(){
        return LazySingletonHolder.innerClassLazySingleton;
    }
}
