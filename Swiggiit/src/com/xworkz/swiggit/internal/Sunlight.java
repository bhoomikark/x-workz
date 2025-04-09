package com.xworkz.swiggit.internal;

public class Sunlight {
    private boolean isSunlightLessToday;
    private String sunlightWavelength;
    private double frequency;

    public Sunlight(boolean isSunlightLessToday, String sunlightWavelength, double frequency) {
        this.isSunlightLessToday = isSunlightLessToday;
        this.sunlightWavelength = sunlightWavelength;
        this.frequency = frequency;
        System.out.println("24. Running Sunlight Constructor");
    }

    @Override
    public String toString() {
        return "Is Sunlight Less Today: " + isSunlightLessToday + ", Sunlight Wavelength: " + sunlightWavelength +
                ", Frequency: " + frequency + " Hz";
    }
}
