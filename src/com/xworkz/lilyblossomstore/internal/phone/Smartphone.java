package com.xworkz.lilyblossomstore.internal.phone;

public class Smartphone extends Phone {

    public Smartphone() {
        super();
        System.out.println("Running Smartphone Constructor - Child class");
    }

    @Override
    public void call() {
        System.out.println("Making a call using smartphone... - Child class");
    }

    @Override
    public void message() {
        System.out.println("Sending a message via smartphone... - Child class");
    }

    @Override
    public void charge() {
        System.out.println("Charging the smartphone with fast charging... - Child class");
    }

    @Override
    public void connectWifi() {
        System.out.println("Smartphone connecting to WiFi... - Child class");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the smartphone... - Child class");
    }
    public void useApps() {
        System.out.println("Child Class");
        System.out.println("Smartphone is using various mobile applications...");
    }
}
