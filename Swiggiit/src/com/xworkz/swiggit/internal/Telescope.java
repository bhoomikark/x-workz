package com.xworkz.swiggit.internal;

public class Telescope {
    public String telescopeType;
    public double magnification;
    public boolean isPortable;

    public Telescope(String telescopeType, double magnification, boolean isPortable) {
        this.telescopeType = telescopeType;
        this.magnification = magnification;
        this.isPortable = isPortable;
        System.out.println("95. Running Telescope Constructor");
    }

    public String toString() {
        return "Type: " + telescopeType + ", Magnification: " + magnification + "x, Portable: " + isPortable;
    }
    @Override
    public int hashCode() {
        return 114;
    }
}
