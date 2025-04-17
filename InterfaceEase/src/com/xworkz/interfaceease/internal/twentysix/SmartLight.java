package com.xworkz.interfaceease.internal.twentysix;

public class SmartLight implements DeviceControl {
    @Override
    public void turnOn() {
        System.out.println("Turning on the smart light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the smart light.");
    }

    @Override
    public void adjustSettings() {
        System.out.println("Adjusting brightness of the smart light.");
    }
@Override
    public void getNotification()
    {
        System.out.println("notification turn On -- smart light");
    }
}
