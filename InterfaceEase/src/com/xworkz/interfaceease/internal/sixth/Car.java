package com.xworkz.interfaceease.internal.sixth;

public class Car implements Vehicle, ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking.");
    }

    @Override
    public void charge() {
        System.out.println("Car is charging.");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Car battery is full.");
    }

    @Override
    public void batteryOn() {
        System.out.println("Battery ON");
    }
}