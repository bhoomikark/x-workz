package com.xworkz.lilyblossomstore.internal.transistor;

public class Transistor {
    public Transistor() {
        System.out.println("Running Transistor Constructor in Transistor class");
    }

    public void powerOn() {
        System.out.println("Parent class");
        System.out.println("Turning on the transistor.");
    }

    public void powerOff() {
        System.out.println("Parent class");
        System.out.println("Turning off the transistor.");
    }

    public void tuneFrequency() {
        System.out.println("Parent class");
        System.out.println("Tuning the transistor to a frequency.");
    }

    public void increaseVolume() {
        System.out.println("Parent class");
        System.out.println("Increasing the volume.");
    }

    public void decreaseVolume() {
        System.out.println("Parent class");
        System.out.println("Decreasing the volume.");
    }
}
