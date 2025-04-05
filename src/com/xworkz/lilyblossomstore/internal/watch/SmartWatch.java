package com.xworkz.lilyblossomstore.internal.watch;

public class SmartWatch extends Watch {

    public SmartWatch() {
        super();
        System.out.println("Running SmartWatch Constructor");
    }

    @Override
    public void showTime() {
        System.out.println("Child class");
        System.out.println("Displaying digital time on screen...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Child class");
        System.out.println("Setting smart alarm with vibration...");
    }

    @Override
    public void stopwatch() {
        System.out.println("Child class");
        System.out.println("Starting stopwatch with lap timer...");
    }

    @Override
    public void changeBattery() {
        System.out.println("Child class");
        System.out.println("Charging smartwatch battery...");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Child class");
        System.out.println("Adjusting silicone strap...");
    }
}
