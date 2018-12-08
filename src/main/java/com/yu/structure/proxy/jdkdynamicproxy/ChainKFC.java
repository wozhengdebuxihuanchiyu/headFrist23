package com.yu.structure.proxy.jdkdynamicproxy;

import java.lang.reflect.Proxy;

public class ChainKFC implements IKFC {
    @Override
    public void eat() {
        IKFC ikfc = (IKFC) Proxy.newProxyInstance(ChainKFC.class.getClassLoader(),
                USAKfc.class.getInterfaces(),
                new DynamicProxy(new USAKfc())
        );
        ikfc.eat();
        System.out.println("中国商店吃KFC..");
    }
}
