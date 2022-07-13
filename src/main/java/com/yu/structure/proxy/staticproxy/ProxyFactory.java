package com.yu.structure.proxy.staticproxy;

/**
 * @author yuchangying
 * @date 2022-06-15 18:14:49
 * 代理模式-静态代理：在不改变被代理类的情况下对被代理类加强，需要实现接口
 * 1、需要被代理类实现的接口
 * 2、需要被代理的类
 * 3、代理工厂
 *
 * 此处为——代理工厂
 */
public class ProxyFactory {

    /**
     * 组合方式整合需要被代理的接口
     */
    private IteachDao iteachDao;

    /**
     * 构造器传入需要被代理的接口
     * @param iteachDao 需要被代理的接口
     */
    public ProxyFactory(IteachDao iteachDao) {
        this.iteachDao = iteachDao;
    }

    /**
     * 执行代理方法，并同时可以前后加强
     */
    public void getProxy(){
        System.out.println("代理前可以执行加强方法，如：日志打印");
        iteachDao.teach();
        System.out.println("代理后可以执行加强方法，如：日志打印或提交事务等");
    }
}
