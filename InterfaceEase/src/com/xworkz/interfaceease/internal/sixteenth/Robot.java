package com.xworkz.interfaceease.internal.sixteenth;

public interface Robot {
    void start();
    void performTask();
    void shutdown();
    default void operateWithRemote()
    {
        System.out.println("operate with remote -- default");
    }
}
