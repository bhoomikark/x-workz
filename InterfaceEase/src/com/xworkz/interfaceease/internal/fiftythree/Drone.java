package com.xworkz.interfaceease.internal.fiftythree;

public interface Drone {
    void launch();
    void captureImage();
    void land();
    default void measureHeight()
    {
        System.out.println("measure height");
    }
}
