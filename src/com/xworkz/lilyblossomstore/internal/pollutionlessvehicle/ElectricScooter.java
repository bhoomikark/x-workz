package com.xworkz.lilyblossomstore.internal.pollutionlessvehicle;

public class ElectricScooter extends EcoFriendlyVehicle {

    public ElectricScooter() {
        super();
        System.out.println("ElectricScooter is being folded for easy storage.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Child class");
        System.out.println("ElectricScooter battery is charging at a fast-charging station.");
    }

    @Override
    public void checkEmission() {
        System.out.println("Child class");
        System.out.println("ElectricScooter produces no emissions at all.");
    }

    @Override
    public void start() {
        System.out.println("Child class");
        System.out.println("ElectricScooter starts silently with a push.");
    }

    @Override
    public void stop() {
        System.out.println("Child class");
        System.out.println("ElectricScooter stops using regenerative braking.");
    }

    @Override
    public void ecoMode() {
        System.out.println("Child class");
        System.out.println("ElectricScooter eco mode extends battery range.");
    }
}
