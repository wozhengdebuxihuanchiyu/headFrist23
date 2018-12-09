package com.yu.structure.adpter.classadpter;

public class Client8 {

    public static void main(String[] args) {
        System.out.println("this is class adpter main");

        NootBook nootBook = new NootBook();


        nootBook.powerOn(new PowerAdpter());
    }
}
