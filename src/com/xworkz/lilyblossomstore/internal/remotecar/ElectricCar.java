package com.xworkz.lilyblossomstore.internal.remotecar;

public class ElectricCar extends RemoteCar {
    public ElectricCar() {
        super();
        System.out.println("Running ElectricCar Constructor in ElectricCar class");
    }

    @Override
    public void start() {
        System.out.println("Child class");
        System.out.println("ElectricCar starts silently with a button press.");
    }

    @Override
    public void stop() {
        System.out.println("Child class");
        System.out.println("ElectricCar stops smoothly using regenerative braking.");
    }

    @Override
    public void accelerate() {
        System.out.println("Child class");
        System.out.println("ElectricCar accelerates rapidly using electric power.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Child class");
        System.out.println("ElectricCar makes a precise left turn.");
    }

    @Override
    public void turnRight() {
        System.out.println("Child class");
        System.out.println("ElectricCar makes a precise right turn.");
    }
}
