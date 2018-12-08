package com.yu.structure.proxy.defindproxy;

/**
 *
 * 美国苹果商店
 *
 * 世界上只有美国商店卖苹果电脑，其余的都是代理
 *
 * RealObject
 */
public class USAMacBookStore implements IMacBookStore {
    @Override
    public void sell() {
        System.out.println("美国苹果店卖苹果电脑..");
    }
}
