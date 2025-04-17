package com.xworkz.interfaceease.internal.eight;

public interface Drivable {
    void startEngine();

    void accelerate();

    void brake();

    default void start() {
        System.out.println("Running default methods in start");
    }
}
