package com.yu.structure.adpter.objectadpter;

public class Client9 {

    public static void main(String[] args) {
        System.out.println("this is object adpter main");

        NootBook nootBook = new NootBook();
        Power220V power220V = new Power220V();
        nootBook.powerOn(new PowerAdpter(power220V));
    }
}
