package com.xworkz.interfaceease.internal.fifth;

public interface Reptile {
    void crawl();
    void shedSkin();
    void makeSound();
    default void sleep()
    {
        System.out.println("Running Reptile");
    }
}