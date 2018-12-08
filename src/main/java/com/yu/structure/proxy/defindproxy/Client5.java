package com.yu.structure.proxy.defindproxy;

public class Client5 {
    public static void main(String[] args) {
        IMacBookStore iMacBookStore = new HongKongMacBookStore();
        iMacBookStore.sell();
    }
}
