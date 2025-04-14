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
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 987;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Holder) {
                Holder otherHolder = (Holder) obj;
                if (this.materialUsed.equals(otherHolder.materialUsed) &&
                        this.noOfNutsUsed == otherHolder.noOfNutsUsed &&
                        this.color.equals(otherHolder.color)) {
                    System.out.println("Both Holders are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
