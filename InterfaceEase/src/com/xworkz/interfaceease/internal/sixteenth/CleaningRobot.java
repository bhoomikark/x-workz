package com.xworkz.interfaceease.internal.sixteenth;

public class CleaningRobot implements Robot {
    @Override
    public void start() {
        System.out.println("Cleaning Robot started.");
    }
    @Override
    public void performTask() {
        System.out.println("Cleaning in progress...");
    }
    @Override
    public void shutdown() {
        System.out.println("Cleaning Robot shutting down.");
    }
@Override
    public void operateWithRemote()
    {
        System.out.println("operate with remote -- Cleaning Robot");
    }
}
