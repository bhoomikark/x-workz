package com.xworkz.interfaceease.internal.twentyone;

public interface Notification {
    void notifyUser();
    void prepareMessage();
    void send();
    default void turnOff()
    {
        System.out.println("turn off notification -- default");
    }
}
