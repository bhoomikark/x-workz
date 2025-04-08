package com.xworkz.lilyblossomstore.internal.instrument;

public class GuitarString {
    public void noOfString(Instrument instrument) {
        System.out.println("\nRunning noOfString(Instrument instrument)");
        System.out.println("==========================================");
        instrument.playSound();
        instrument.adjustTuning();
        instrument.changeVolume();
        instrument.maintainInstrument();
        instrument.storeInstrument();

        if (instrument instanceof Guitar) {
            System.out.println("Casting to Guitar...");
            Guitar guitar = (Guitar) instrument;
            guitar.showStrings();
        }
    }
}
