package com.xworkz.lilyblossomstore.internal.vehicle;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("No-argument constructor of Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Child Class");
        System.out.println("Starting engine in Car.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Child Class");
        System.out.println("Stopping engine in Car.");
    }

    @Override
    public void fuelType() {
        System.out.println("Child Class");
        System.out.println("Car runs on petrol or electricity.");
    }

    @Override
    public void accelerate() {
        System.out.println("Child Class");
        System.out.println("Car is accelerating smoothly.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Child Class");
        System.out.println("Car brakes are applied.");
    }
}
