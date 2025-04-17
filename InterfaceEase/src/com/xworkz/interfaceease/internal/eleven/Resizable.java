package com.xworkz.interfaceease.internal.eleven;

public interface Resizable {
    void resizeWidth();
    void resizeHeight();
    void maintainAspectRatio();
    default void resizebreadth()
    {
        System.out.println("Running resize");
    }
}
