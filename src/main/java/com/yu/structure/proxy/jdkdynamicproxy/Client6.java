package com.yu.structure.proxy.jdkdynamicproxy;



public class Client6 {

    public static void main(String[] args) {

       IMacBookStore iMacBookStore = new HongKongMacBookStore();
       iMacBookStore.sell();

       IKFC ikfc = new ChainKFC();
       ikfc.eat();
    }
}
