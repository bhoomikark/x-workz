package com.xworkz.lilyblossomstore.internal.wheeler;

public class Motorcycle extends TwoWheeler {
    public Motorcycle() {
        super();
        System.out.println("Running Motorcycle Constructor");
    }

    @Override
    public void startEngine() {
        System.out.println("Child class");
        System.out.println("Motorcycle engine started with self-start.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Child class");
        System.out.println("Motorcycle engine turned off.");
    }

    @Override
    public void accelerate() {
        System.out.println("Child class");
        System.out.println("Motorcycle is speeding up quickly.");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Child class");
        System.out.println("Motorcycle brakes applied safely.");
    }

    @Override
    public void honk() {
        System.out.println("Child class");
        System.out.println("Motorcycle horn beeped.");
    }
}
