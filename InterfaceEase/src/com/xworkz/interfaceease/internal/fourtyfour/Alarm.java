package com.xworkz.interfaceease.internal.fourtyfour;

public interface Alarm {
    void setAlarm();
    void ring();
    void stopAlarm();
    default void snooze()
    {
        System.out.println("snooze -- default");
    }
}
