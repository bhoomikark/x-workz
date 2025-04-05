package com.xworkz.lilyblossomstore.internal.laptop;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        super();
        System.out.println("No-argument constructor of GamingLaptop - Child class");
    }

    @Override
    public void turnOn() {
        System.out.println("Gaming laptop is turning on - Child class.");
    }

    @Override
    public void turnOff() {
        System.out.println("Gaming laptop is shutting down - Child class.");
    }

    @Override
    public void charge() {
        System.out.println("Gaming laptop is charging - Child class.");
    }

    @Override
    public void openSoftware() {
        System.out.println("Opening game software - Child class.");
    }

    @Override
    public void browseInternet() {
        System.out.println("Gaming laptop is browsing the internet - Child class.");
    }
}
