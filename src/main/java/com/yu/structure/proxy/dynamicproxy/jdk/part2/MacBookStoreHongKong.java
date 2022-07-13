package com.yu.structure.proxy.dynamicproxy.jdk.part2;


import java.lang.reflect.Proxy;

/**
 * 香港苹果商店ProxyObject
 */
public class MacBookStoreHongKong implements IMacBookStore {


    @Override
    public void sell() {
        IMacBookStore iMacBookStore = (IMacBookStore) Proxy.newProxyInstance(MacBookStoreHongKong.class.getClassLoader(),
                MacBookStoreUsa.class.getInterfaces(),
                new DynamicProxy(new MacBookStoreUsa()));
        iMacBookStore.sell();
        System.out.println("香港苹果店卖出苹果电脑...");
    }
}

