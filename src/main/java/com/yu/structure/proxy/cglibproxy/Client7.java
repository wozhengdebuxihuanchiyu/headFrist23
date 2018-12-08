package com.yu.structure.proxy.cglibproxy;

public class Client7  {

    public static void main(String[] args) {
        USAMacBookStore usaMacBookStore = new HongKongMacBookStore();
        usaMacBookStore.sell();
    }
}

