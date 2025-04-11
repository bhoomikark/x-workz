package com.xworkz.swiggit.internal;

public class Barbie {
    private String barbieMovieName;
    private String hostedChannel;
    private boolean isAvailableInTheatres;

    public Barbie(String barbieMovieName, String hostedChannel, boolean isAvailableInTheatres) {
        this.barbieMovieName = barbieMovieName;
        this.hostedChannel = hostedChannel;
        this.isAvailableInTheatres = isAvailableInTheatres;
        System.out.println("23. Running Barbie Constructor");
    }

    @Override
    public String toString() {
        return "Barbie Movie Name: " + barbieMovieName + ", Hosted Channel: " + hostedChannel +
                ", Available in Theatres: " + isAvailableInTheatres;
    }

    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 111;
    }
}
