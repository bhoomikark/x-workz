package com.xworkz.lilyblossomstore.internal.vehicle;


public class Vehicle {
    public Vehicle() {
        System.out.println("Running Vehicle Constructor in Vehicle class");
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    public void stopEngine() {
        System.out.println("Stopping engine...");
    }

    public void fuelType() {
        System.out.println("Vehicle can run on petrol, diesel, or electricity.");
    }
    public void accelerate() {
        System.out.println("Accelerating the vehicle.");
    }

    public void applyBrakes() {
        System.out.println("Applying brakes to slow down the vehicle.");
    }
}

