package com.xworkz.lilyblossomstore.internal.watch;

public class CasioWatch {
    public void price(Watch watch) {
        System.out.println("\nInside CasioWatch class");

        watch.showTime();
        watch.setAlarm();
        watch.stopwatch();
        watch.changeBattery();
        watch.adjustStrap();

        if (watch instanceof SmartWatch) {
            System.out.println("Casting Watch to SmartWatch to access child-specific method...");
            SmartWatch sw = (SmartWatch) watch;
            sw.trackHeartRate();
        }
    }
}
