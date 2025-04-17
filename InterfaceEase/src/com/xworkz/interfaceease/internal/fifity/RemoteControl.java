package com.xworkz.interfaceease.internal.fifity;

public interface RemoteControl {
    void turnOn();
    void changeChannel();
    void turnOff();
    default void pressButton()
    {
        System.out.println("Running press button");
    }
}
