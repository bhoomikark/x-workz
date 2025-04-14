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

    public String getTitle() {
        return barbieMovieName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Barbie) {
                System.out.println("Barbie is reference of object");
                Barbie barbie1 = this;
                Barbie barbie2 = (Barbie) obj;
                if (barbie1.barbieMovieName.equals(barbie2.barbieMovieName)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}