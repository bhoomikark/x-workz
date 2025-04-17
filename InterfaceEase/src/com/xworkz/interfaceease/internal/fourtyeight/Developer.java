package com.xworkz.interfaceease.internal.fourtyeight;

public interface Developer {
    void code();
    void test();
    void deploy();
    default  void develop()
    {
        System.out.println("develop-- default");
    }
}
