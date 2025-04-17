package com.xworkz.interfaceease.internal.fourteen;

import java.sql.SQLOutput;

public interface RemoteControl {
    void turnOn();
    void changeChannel();
    void turnOff();
    default void mute()
    {
        System.out.println("default mute");
    }
}
