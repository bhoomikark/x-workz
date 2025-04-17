package com.xworkz.interfaceease.internal.second;

public interface Mammal {
    void giveBirth();
    void groom();
    void feedYoung();
    default void care()
    {
        System.out.println("care -- default");
    }
}
