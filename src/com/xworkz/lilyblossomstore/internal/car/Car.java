package com.xworkz.lilyblossomstore.internal.car;

public class Car {

    public Car() {
        System.out.println("Parent Class");
        System.out.println("Running Car Constructor in Car class");
    }

    public void start() {
        System.out.println("Parent Class");
        System.out.println("Car is starting.");
    }

    public void accelerate() {
        System.out.println("Parent Class");
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Parent Class");
        System.out.println("Car is braking.");
    }

    public void fuelUp() {
        System.out.println("Parent Class");
        System.out.println("Refueling the car.");
    }

    public void turnOff() {
        System.out.println("Parent Class");
        System.out.println("Car is turning off.");
    }
}
