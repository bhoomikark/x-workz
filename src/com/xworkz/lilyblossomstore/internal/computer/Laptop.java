package com.xworkz.lilyblossomstore.internal.computer;

public class Laptop extends Computer {
    public Laptop() {
        super();

        System.out.println("Running Laptop Constructor in Laptop class");
    }

    @Override
    public void processData() {
        System.out.println("Child Class");
        System.out.println("Processing data on laptop...");
    }

    @Override
    public void runSoftware() {
        System.out.println("Child Class");
        System.out.println("Running software on laptop...");
    }

    @Override
    public void connectInternet() {
        System.out.println("Child Class");
        System.out.println("Connecting laptop to the internet...");
    }

    @Override
    public void storeData() {
        System.out.println("Child Class");
        System.out.println("Storing data on laptop...");
    }

    @Override
    public void displayOutput() {
        System.out.println("Child Class");
        System.out.println("Displaying output on laptop...");
    }
    public void showLaptopBrand() {
        System.out.println("Child Class");
        System.out.println("Showing Laptop Brand: DELL");
    }
}
