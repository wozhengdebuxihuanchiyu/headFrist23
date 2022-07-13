package com.yu.structure.proxy.dynamicproxy.jdk.part1;

/**
 * @author yuchangying
 * @date 2022-06-15 18:37:15
 * 代理模式-动态代理-jdk:使用jdk提供的InvocationHandler实现动态代理，需要实现接口
 * 1、需要被代理的类的抽象
 * 2、需要被代理的类
 * 3、代理工厂
 *
 * 此处为——需要被代理的类
 */
public class TeachDao implements IteachDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课...");
    }
}
