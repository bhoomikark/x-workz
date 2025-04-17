package com.xworkz.interfaceease.internal.fiftyfour;

public class Fitbit implements FitnessTracker {
    @Override
    public void startTracking() {
        System.out.println("Tracking started.");
    }

    @Override
    public void monitorSteps() {
        System.out.println("Steps monitored.");
    }

    @Override
    public void endTracking() {
        System.out.println("Tracking stopped.");
    }
}
