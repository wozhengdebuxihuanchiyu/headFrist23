package com.yu.structure.proxy.dynamicproxy.jdk.part2;

import java.lang.reflect.Proxy;

/**
 * @author yuchangying
 * @date 2022-06-15 18:37:15
 * 代理模式-动态代理-jdk:使用jdk提供的InvocationHandler实现动态代理，需要实现接口
 * 1、需要被代理的类的抽象
 * 2、需要被代理的类
 * 3、代理工厂
 *
 * 此处为——需要被代理的类，中国的KFC
 */
public class KfcChain implements Ikfc {
    @Override
    public void eat() {
        Ikfc ikfc = (Ikfc) Proxy.newProxyInstance(KfcChain.class.getClassLoader(),
                KfcUsa.class.getInterfaces(),
                new DynamicProxy(new KfcUsa())
        );
        ikfc.eat();
        //此处执行加强方法时将DynamicProxy类独立出来可以公用
        System.out.println("KfcChain的eat()执行加强方法，放入辣椒");
    }
}
