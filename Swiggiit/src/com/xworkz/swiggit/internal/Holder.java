package com.xworkz.swiggit.internal;

public class Holder {
    private String materialUsed;
    private int noOfNutsUsed;
    private String color;

    public Holder(String materialUsed, int noOfNutsUsed, String color) {
        this.materialUsed = materialUsed;
        this.noOfNutsUsed = noOfNutsUsed;
        this.color = color;
        System.out.println("3. Running Holder Constructor");
    }

    @Override
    public String toString() {
        return "Material Used: " + materialUsed + ", No of Nuts Used: " + noOfNutsUsed +
                ", Color: " + color;
    }
}
