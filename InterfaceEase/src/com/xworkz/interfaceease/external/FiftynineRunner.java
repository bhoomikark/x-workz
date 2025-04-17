package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftynine.*;

public class FiftynineRunner {
    public static void main(String[] args) {
        SmartWatch watch = new AppleWatch();
        watch.showTime();
        watch.monitorHeartRate();
        watch.receiveNotification();
        watch.seeTime();
    }
}
