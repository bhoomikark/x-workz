package com.xworkz.lilyblossomstore.internal.instrument;

public class Guitar extends Instrument {

    public Guitar() {
        super();

        System.out.println("Creating a Guitar object...");
    }

    @Override
    public void playSound() {
        System.out.println("Child Class");
        System.out.println("Strumming the guitar strings...");
    }

    @Override
    public void adjustTuning() {
        System.out.println("Child Class");
        System.out.println("Tuning the guitar strings...");
    }

    @Override
    public void changeVolume() {
        System.out.println("Child Class");
        System.out.println("Adjusting volume using the amp or knobs...");
    }

    @Override
    public void maintainInstrument() {
        System.out.println("Child Class");
        System.out.println("Cleaning and changing guitar strings...");
    }

    @Override
    public void storeInstrument() {
        System.out.println("Child Class");
        System.out.println("Storing the guitar in a case...");
    }
    public void showStrings() {
        System.out.println("Child Class");
        System.out.println("This guitar has 6 strings.");
    }
}
