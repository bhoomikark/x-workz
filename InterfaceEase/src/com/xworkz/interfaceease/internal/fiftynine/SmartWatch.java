package com.xworkz.interfaceease.internal.fiftynine;

public interface SmartWatch {
    void showTime();
    void monitorHeartRate();
    void receiveNotification();
    default void seeTime()
    {
        System.out.println("view time");
    }
}
