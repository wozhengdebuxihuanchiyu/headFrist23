package com.yu.structure.proxy.dynamicproxy.jdk.part2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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
public class DynamicProxy implements InvocationHandler {

    /**
     * 被代理的类
     */
    Object realObjct;

    /**
     * 构造器初始化需要被代理的类
     * @param realObjct 被代理的类
     */
    public DynamicProxy(Object realObjct){
        this.realObjct = realObjct;
    }

    /**
     * 实现InvocationHandler接口必须实现的方法
     * 执行被代理类的方法
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("即将执行被代理类的方法");
        //调用invoke方法
        Object ret = method.invoke(realObjct, args);
        System.out.println("代理类方法执行完毕：" + realObjct.getClass().getSimpleName());
        return ret;
    }
}
