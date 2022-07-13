package com.yu.structure.proxy.dynamicproxy.jdk.part1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yuchangying
 * @date 2022-06-15 18:37:15
 * 代理模式-动态代理-jdk:使用jdk提供的InvocationHandler实现动态代理，需要实现接口
 * 1、需要被代理的类的抽象
 * 2、需要被代理的类
 * 3、代理工厂
 *
 * 此处为——代理工厂
 */
public class ProxyFactory{

    /**
     * 因为是动态代理，无需绑定固定的类
     * 此处可以是IteachDao,也可以是别的类
     */
    private Object object;

    /**
     * 构造器初始化被代理对象
     * @param object 被代理的对象
     */
    public ProxyFactory(Object object) {
        this.object = object;
    }


    /**
     * 获取代理对象
     * @return 代理对象
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                        //此处加强方法时，当遇到不同类型的类被加强时只能执行同样的代码
                        //如：log.info,connection.close等
                        //当不同的类使用此方法，要执行不同的加强内容时无法做到
                        System.out.println("代理前可以执行加强方法，如：日志打印");
                        Object invoke = method.invoke(object, args);
                        System.out.println("代理后可以执行加强方法，如：日志打印或提交事务等");
                        return invoke;
                    }
                });
    }
}
