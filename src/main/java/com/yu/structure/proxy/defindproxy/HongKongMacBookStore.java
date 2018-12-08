package com.yu.structure.proxy.defindproxy;

/**
 * 香港苹果商店ProxyObject
 */
public class HongKongMacBookStore implements IMacBookStore{
    //需要被代理的类RealObject
    private IMacBookStore iMacBookStore = new USAMacBookStore();

    @Override
    public void sell() {
        //代理类的作用就是需要在RealObject的基础上增加一个访问层，实际访问的还是美国的苹果店
        iMacBookStore.sell();
        System.out.println("香港苹果店卖出苹果电脑...");
    }
}
