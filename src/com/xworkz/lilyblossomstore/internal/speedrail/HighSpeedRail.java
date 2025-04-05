package com.xworkz.lilyblossomstore.internal.speedrail;

public class HighSpeedRail {
    public HighSpeedRail() {
        System.out.println("Running HighSpeedRail Constructor in HighSpeedRail class");
    }

    public void activateMagLev() {
        System.out.println("Parent class");
        System.out.println("HighSpeedRail activated maglev mode.");
    }

    public void reachMaxSpeed() {
        System.out.println("Parent class");
        System.out.println("HighSpeedRail is reaching maximum speed.");
    }

    public void startJourney() {
        System.out.println("Parent class");
        System.out.println("HighSpeedRail journey started.");
    }

    public void stopJourney()
    {
        System.out.println("Parent class");
        System.out.println("HighSpeedRail journey stopped.");
    }

    public void soundHorn() {
        System.out.println("Parent class");
        System.out.println("HighSpeedRail horn sounded.");
    }
}
