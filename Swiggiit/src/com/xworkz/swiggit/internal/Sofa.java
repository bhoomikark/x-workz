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
}
