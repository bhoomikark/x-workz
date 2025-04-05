package com.xworkz.lilyblossomstore.internal.railway;

public class Train extends RailwayVehicle {
    public Train() {
        super();
        System.out.println("Train doors opened.");
    }

    @Override
    public void startJourney() {
        System.out.println("Child class");
        System.out.println("Train is departing from the station...");
    }

    @Override
    public void stopJourney() {
        System.out.println("Child class");
        System.out.println("Train has arrived at the destination...");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Child class");
        System.out.println("Train is picking up speed...");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Child class");
        System.out.println("Train is slowing down...");
    }

    @Override
    public void soundHorn() {
        System.out.println("Child class");
        System.out.println("Train horn goes choo-choo...");
    }
}
