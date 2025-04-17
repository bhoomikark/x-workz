package com.xworkz.interfaceease.internal.fiftynine;

public class AppleWatch implements SmartWatch {
    @Override
    public void showTime() {
        System.out.println("Time displayed: 10:45 AM");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Heart rate: 75 bpm");
    }

    @Override
    public void receiveNotification() {
        System.out.println("You have a new message.");
    }
@Override
    public void seeTime()
    {
        System.out.println("view time");
    }
}
