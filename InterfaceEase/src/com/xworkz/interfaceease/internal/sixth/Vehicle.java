package com.xworkz.interfaceease.internal.sixth;

public interface Vehicle {
    void start();
    void stop();
    void honk();
    default void applyBrake()
    {
        System.out.println("apply brake -- default");
    }
}