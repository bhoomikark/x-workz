package com.xworkz.lilyblossomstore.internal.space;

public class Spacecraft {
    public Spacecraft() {
        System.out.println("Running Spacecraft Constructor in Spacecraft class");
    }

    public void launch() {
        System.out.println("Parent class");
        System.out.println("Launching the spacecraft...");
    }

    public void land() {
        System.out.println("Parent class");
        System.out.println("Landing the spacecraft...");
    }

    public void orbit() {
        System.out.println("Parent class");
        System.out.println("Orbiting around a planet...");
    }

    public void communicate() {
        System.out.println("Parent class");
        System.out.println("Communicating with Earth...");
    }

    public void collectData() {
        System.out.println("Parent class");
        System.out.println("Collecting scientific data...");
    }
}
