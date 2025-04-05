package com.xworkz.lilyblossomstore.internal.transistor;

public class Radio extends Transistor {
    public Radio() {
        super();
        System.out.println("Running Radio Constructor in Radio class");
    }

    @Override
    public void powerOn() {
        System.out.println("Child class");
        System.out.println("Powering on the radio.");
    }

    @Override
    public void powerOff() {
        System.out.println("Child class");
        System.out.println("Powering off the radio.");
    }

    @Override
    public void tuneFrequency() {
        System.out.println("Child class");
        System.out.println("Tuning the radio to a specific station.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Child class");
        System.out.println("Turning up the radio volume.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Child class");
        System.out.println("Turning down the radio volume.");
    }
}
