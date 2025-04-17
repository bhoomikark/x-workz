package com.xworkz.interfaceease.internal.twentysix;

public interface DeviceControl {
    void turnOn();
    void turnOff();
    void adjustSettings();
    default void getNotification()
    {
        System.out.println("notification turn On -- default");
    }
}
