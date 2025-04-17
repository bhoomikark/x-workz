package com.xworkz.interfaceease.internal.eight;

public class FlyingCar implements Drivable,Flyable{
    @Override
    public void startEngine() {
        System.out.println("starEngine -- Flying car");

    }

    @Override
    public void accelerate() {
        System.out.println("accelerate -- Flying car");

    }

    @Override
    public void brake() {
        System.out.println("brake -- Flying car");
    }

    @Override
    public void takeOff() {
        System.out.println("takeoff -- Flying car");
    }

    @Override
    public void fly() {
        System.out.println("fly -- Flying car");
    }

    @Override
    public void land() {
        System.out.println("land -- Flying car");
    }
}
