package com.xworkz.interfaceease.internal.fiftyone;

public interface SmartLight {
    void connect();
    void turnOnLight();
    void turnOffLight();
    default void automatic()
    {
        System.out.println("Running automatic");
    }
}
