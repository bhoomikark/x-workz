package com.xworkz.lilyblossomstore.internal.instrument;

public class Instrument {

    public Instrument() {

        System.out.println("Instrument Constructor: Initializing a musical instrument...");
    }

    public void playSound() {
        System.out.println("Parent Class");
        System.out.println("Playing sound...");
    }

    public void adjustTuning() {
        System.out.println("Parent Class");
        System.out.println("Adjusting tuning...");
    }

    public void changeVolume() {
        System.out.println("Parent Class");
        System.out.println("Changing volume...");
    }

    public void maintainInstrument() {
        System.out.println("Parent Class");
        System.out.println("Maintaining the instrument...");
    }

    public void storeInstrument() {
        System.out.println("Parent Class");
        System.out.println("Storing the instrument...");
    }
}
