package com.xworkz.swiggit.internal;

public class Guitar {
    public String guitarType;
    public int noOfStrings;
    public boolean isElectric;

    public Guitar(String guitarType, int noOfStrings, boolean isElectric) {
        this.guitarType = guitarType;
        this.noOfStrings = noOfStrings;
        this.isElectric = isElectric;
        System.out.println("92. Running Guitar Constructor");
    }
@Override
    public String toString() {
        return "Type: " + guitarType + ", Strings: " + noOfStrings + ", Electric: " + isElectric;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 999;
    }
}
