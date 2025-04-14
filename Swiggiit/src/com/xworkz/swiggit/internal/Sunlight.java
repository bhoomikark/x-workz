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
    @Override
    public int hashCode() {
        return 108;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Sunlight) {
                System.out.println("Sunlight is reference of object");
                Sunlight s1 = this;
                Sunlight s2 = (Sunlight) obj;


                if (s1.sunlightWavelength.equals(s2.sunlightWavelength) &&
                        s1.frequency == s2.frequency) {
                    System.out.println("Both Sunlight objects are the same (based on Wavelength and Frequency)");
                    return true;
                }
            }
        }
        return false;
    }
}
