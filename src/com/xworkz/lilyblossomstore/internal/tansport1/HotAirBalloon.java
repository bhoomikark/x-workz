package com.xworkz.lilyblossomstore.internal.tansport1;

public class HotAirBalloon extends AirTransport {
    public HotAirBalloon() {
        super();
        System.out.println("Child class");
        System.out.println("HotAirBalloon is releasing hot air to descend.");
    }

    @Override
    public void takeOff() {
        System.out.println("Child class");
        System.out.println("HotAirBalloon is taking off slowly with hot air.");
    }

    @Override
    public void land() {
        System.out.println("Child class");
        System.out.println("HotAirBalloon is landing gently.");
    }

    @Override
    public void navigate() {
        System.out.println("Child class");
        System.out.println("HotAirBalloon is navigating with wind direction.");
    }

    @Override
    public void checkFuelLevel() {
        System.out.println("Child class");
        System.out.println("HotAirBalloon is checking propane level.");
    }

    @Override
    public void deployParachute() {
        System.out.println("Child class");
        System.out.println("HotAirBalloon does not have parachute deployment.");
    }
}
