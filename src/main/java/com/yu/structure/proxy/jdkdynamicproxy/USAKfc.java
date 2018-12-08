package com.yu.structure.proxy.jdkdynamicproxy;

public class USAKfc implements IKFC{
    @Override
    public void eat() {
        System.out.println("美国的KFC生产...");
    }
}
