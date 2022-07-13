package com.yu.structure.proxy.dynamicproxy.jdk.part2;

public class MacBookStoreUsa implements IMacBookStore {
    @Override
    public void sell() {
        System.out.println("美国商店卖苹果电脑...");
    }
}
