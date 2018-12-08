package com.yu.structure.proxy.jdkdynamicproxy;

public class USAMacBookStore implements IMacBookStore {
    @Override
    public void sell() {
        System.out.println("美国商店卖苹果电脑...");
    }
}
