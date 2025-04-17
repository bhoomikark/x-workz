package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentysix.*;

public class TwentySixRunner {
    public static void main(String[] args) {
        DeviceControl dc = new SmartLight();
        dc.turnOn();
        dc.turnOff();
        dc.adjustSettings();
        dc.getNotification();
    }
}
