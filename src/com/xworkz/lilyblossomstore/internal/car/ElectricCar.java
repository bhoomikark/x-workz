package com.xworkz.lilyblossomstore.internal.car;

public class ElectricCar extends Car {

    public ElectricCar() {
        super();
        System.out.println("Child Class");
        System.out.println("No-argument constructor of ElectricCar");
    }

    @Override
    public void start() {
        System.out.println("Child Class");
        System.out.println("Electric car is powering on silently.");
    }

    @Override
    public void accelerate() {
        System.out.println("Child Class");
        System.out.println("Electric car is accelerating with instant torque.");
    }

    @Override
    public void brake() {
        System.out.println("Child Class");
        System.out.println("Electric car is braking with regenerative system.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Child Class");
        System.out.println("Charging the electric car.");
    }

    @Override
    public void turnOff() {
        System.out.println("Child Class");
        System.out.println("Electric car is powering down.");
    }
}
