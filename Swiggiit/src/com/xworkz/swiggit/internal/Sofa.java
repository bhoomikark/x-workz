package com.xworkz.swiggit.internal;

public class Sofa {
    private byte numberOfSeats;
    private boolean isRecliner;
    private int sofaLengthInInches;

    public Sofa(byte numberOfSeats, boolean isRecliner, int sofaLengthInInches) {
        this.numberOfSeats = numberOfSeats;
        this.isRecliner = isRecliner;
        this.sofaLengthInInches = sofaLengthInInches;
        System.out.println("80. Running Sofa Constructor");
    }

    public String toString() {
        return "Seats: " + numberOfSeats + ", Recliner: " + isRecliner + ", Length: " + sofaLengthInInches + " inches";
    }
    @Override
    public int hashCode() {
        return 105;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Sofa) {
                System.out.println("Sofa is reference of object");
                Sofa sofa1 = this;
                Sofa sofa2 = (Sofa) obj;
                if (sofa1.numberOfSeats == sofa2.numberOfSeats &&
                        sofa1.sofaLengthInInches == sofa2.sofaLengthInInches) {
                    System.out.println("Both sofas are same (based on seats and length)");
                    return true;
                }
            }
        }
        return false;
    }
}
