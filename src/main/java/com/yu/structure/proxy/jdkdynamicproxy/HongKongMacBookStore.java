package com.yu.structure.proxy.jdkdynamicproxy;


import java.lang.reflect.Proxy;

/**
 * 香港苹果商店ProxyObject
 */
public class HongKongMacBookStore implements IMacBookStore {


    @Override
    public void sell() {
        IMacBookStore iMacBookStore = (IMacBookStore) Proxy.newProxyInstance(HongKongMacBookStore.class.getClassLoader(),
                USAMacBookStore.class.getInterfaces(),
                new DynamicProxy(new USAMacBookStore()));
        iMacBookStore.sell();
        System.out.println("香港苹果店卖出苹果电脑...");
    }
}

