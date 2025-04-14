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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Telescope) {
            Telescope telescope1 = this;
            Telescope telescope2 = (Telescope) obj;

            if (telescope1.telescopeType.equals(telescope2.telescopeType) && telescope1.magnification == telescope2.magnification) {
                return true;
            }
        }
        return false;
    }
}
