package com.xworkz.lilyblossomstore.internal.speedrail;

public class BulletTrain extends HighSpeedRail {
    public BulletTrain() {
        super();
        System.out.println("Running BulletTrain Constructor in BulletTrain class");
    }

    @Override
    public void activateMagLev() {
        System.out.println("Child class");
        System.out.println("BulletTrain activated maglev for smooth levitation.");
    }

    @Override
    public void reachMaxSpeed() {
        System.out.println("Child class");
        System.out.println("BulletTrain is accelerating to 320 km/h.");
    }

    @Override
    public void startJourney() {
        System.out.println("Child class");
        System.out.println("BulletTrain journey has commenced with no delay.");
    }

    @Override
    public void stopJourney() {
        System.out.println("Child class");
        System.out.println("BulletTrain journey stopped with precision braking.");
    }

    @Override
    public void soundHorn() {
        System.out.println("Child class");
        System.out.println("BulletTrain horn is sounding with advanced warning system.");
    }
}
