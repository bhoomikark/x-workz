package com.xworkz.interfaceease.internal.sixth;

public interface ElectricVehicle {
    void charge();
    void batteryStatus();
    void batteryOn();
    default void checkmilage()
    {
        System.out.println("check milage -- default");
    }
}
