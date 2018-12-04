package com.yu.singleton.lazysingleton;

/**
 * 赖汉单例模式：判断需要创建的对象是不是存在，所以很懒
 *
 * 这种的单例模式是线程不安全的
 * 解决方法：
 * @see  DCLLazySingleton
 * @see InnerClassLazySingleton
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getLazySingleton(){
        //测试线程安全问题
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
