package com.xworkz.interfaceease.internal.sixth;

public class Bike implements Vehicle, ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }

    @Override
    public void honk() {
        System.out.println("Bike is honking.");
    }

    @Override
    public void charge() {
        System.out.println("Bike is charging.");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Bike battery is half.");
    }

    @Override
    public void batteryOn() {
        System.out.println("Battery ON.");
    }
    }
