package com.xworkz.interfaceease.internal.eight;

public class Car implements Drivable {
    @Override
    public void startEngine() {
        System.out.println("startEngine -- Car");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate -- Car");

    }

    @Override
    public void brake() {
        System.out.println("brake -- Car");

    }

    @Override
    public void start() {
        //Drivable.super.start();
        System.out.println("start -- Car");
    }
}
