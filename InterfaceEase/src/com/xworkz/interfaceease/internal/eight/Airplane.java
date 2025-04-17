package com.xworkz.interfaceease.internal.eight;

public class Airplane implements Flyable {

    @Override
    public void takeOff() {
        System.out.println("takeoff -- Airplane");
    }

    @Override
    public void fly() {
        System.out.println("fly -- airplane");
    }

    @Override
    public void land() {
        System.out.println("fly -- airplane");
    }

    @Override
    public void Departure() {
        System.out.println("Departure -- Airplane");
    }
}
