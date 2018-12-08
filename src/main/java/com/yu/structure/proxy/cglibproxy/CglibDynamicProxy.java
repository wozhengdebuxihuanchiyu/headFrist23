package com.yu.structure.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicProxy implements MethodInterceptor {


    private Object realObject;

    public CglibDynamicProxy(Object realObject){this.realObject = realObject;}

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("进入cglib代理...");
        Object invoke = method.invoke(realObject, objects);
        System.out.println("被代理的类：" + realObject.getClass().getSimpleName());
        return invoke;
    }

    public static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        // 设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        // 设置代理人
        enhancer.setCallback(new CglibDynamicProxy(target));
        return enhancer.create();
    }
}
