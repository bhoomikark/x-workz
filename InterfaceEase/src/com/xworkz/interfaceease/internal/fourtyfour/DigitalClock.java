package com.xworkz.interfaceease.internal.fourtyfour;

public class DigitalClock implements Alarm {
    @Override
    public void setAlarm() {
        System.out.println("Alarm set.");
    }
    @Override
    public void ring() {
        System.out.println("Alarm ringing!");
    }
    @Override
    public void stopAlarm() {
        System.out.println("Alarm stopped.");
    }
}
