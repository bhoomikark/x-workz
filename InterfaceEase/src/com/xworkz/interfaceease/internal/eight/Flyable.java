package com.xworkz.interfaceease.internal.eight;

public interface Flyable {
    void takeOff();
    void fly();
    void land();
    default void Departure()
    {
        System.out.println("Running departure in Flyable");
    }
}
