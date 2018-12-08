package com.yu.structure.proxy.cglibproxy;

/**
 * 香港苹果商店ProxyObject
 */
public class HongKongMacBookStore extends USAMacBookStore {


    @Override
    public void sell() {
        USAMacBookStore usaMacBookStore = (USAMacBookStore) CglibDynamicProxy.getProxy(new USAMacBookStore());
        usaMacBookStore.sell();
        System.out.println("香港苹果店卖出苹果电脑...");
    }
}

