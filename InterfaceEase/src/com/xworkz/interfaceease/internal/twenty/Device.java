package com.xworkz.interfaceease.internal.twenty;

public interface Device {
    void powerOn();
    void performFunction();
    void powerOff();
    default void reboot()
    {
        System.out.println("perform reboot -- default");
    }
}
