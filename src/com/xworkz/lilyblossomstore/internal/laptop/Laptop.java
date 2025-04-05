package com.xworkz.lilyblossomstore.internal.laptop;

public class Laptop {
    public Laptop() {
        System.out.println("Running Laptop Constructor in Parent class");
    }

    public void turnOn() {
        System.out.println("Laptop is turning on - Parent class.");
    }

    public void turnOff() {
        System.out.println("Laptop is shutting down - Parent class.");
    }

    public void charge() {
        System.out.println("Laptop is charging - Parent class.");
    }

    public void openSoftware() {
        System.out.println("Opening a software application - Parent class.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet - Parent class.");
    }
}
