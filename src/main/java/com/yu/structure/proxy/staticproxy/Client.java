package com.yu.structure.proxy.staticproxy;

import java.util.ArrayList;

/**
 * @author yuchangying
 * @date 2022-06-15 18:14:49
 *
 * 代理模式-静态代理：在不改变被代理类的情况下对被代理类加强，需要实现接口
 * 1、需要被代理类实现的接口
 * 2、需要被代理的类
 * 3、代理工厂
 */
public class Client {

    public static void main(String[] args) {
        IteachDao iteachDao = new TeachDao();

        ProxyFactory proxyFactory = new ProxyFactory(iteachDao);
        proxyFactory.getProxy();
    }
}
