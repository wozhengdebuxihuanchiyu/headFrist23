package com.yu.structure.proxy.dynamicproxy.jdk.part2;



public class Client6 {

    public static void main(String[] args) {

//       IMacBookStore iMacBookStore = new MacBookStoreHongKong();
//       iMacBookStore.sell();

       Ikfc ikfc = new KfcChain();
       ikfc.eat();
    }
}
