package com.xworkz.interfaceease.internal.eight;

public class Helicopter implements Drivable,Flyable {
    @Override
    public void startEngine() {
        System.out.println("starEngine -- Helicopter");

    }

    @Override
    public void accelerate() {
        System.out.println("accelerate -- Helicopter");

    }

    @Override
    public void brake() {
        System.out.println("brake -- Helicopter");
    }

    @Override
    public void takeOff() {
        System.out.println("takeoff -- Helicopter");
    }

    @Override
    public void fly() {
        System.out.println("fly -- Helicopter");
    }

    @Override
    public void land() {
        System.out.println("land -- Helicopter");
    }
}
