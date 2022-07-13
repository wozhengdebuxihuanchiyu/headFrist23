package com.yu.structure.proxy.staticproxy;


/**
 * @author yuchangying
 * @date 2022-06-15 18:14:49
 * 代理模式-静态代理：在不改变被代理类的情况下对被代理类加强，需要实现接口
 * 1、需要被代理类实现的接口
 * 2、需要被代理的类
 * 3、代理工厂
 *
 * 此处为——需要被代理类实现的接口
 */
public interface IteachDao {

    void teach();
}
