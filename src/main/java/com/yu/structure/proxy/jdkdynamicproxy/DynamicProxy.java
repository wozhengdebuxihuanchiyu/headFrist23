package com.yu.structure.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现动态代理的类
 */
public class DynamicProxy implements InvocationHandler {

    //具体需要执行的类
    Object realObjct;
    //初始化
    public DynamicProxy(Object realObjct){
        this.realObjct = realObjct;
    }

    //实现InvocationHandler接口必须实现的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入invoke方法...");
        //调用invoke方法
        Object ret = method.invoke(realObjct, args);
        System.out.println("代理了类:" + realObjct.getClass().getSimpleName());
        return ret;
    }
}
