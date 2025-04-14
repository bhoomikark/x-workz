package com.xworkz.swiggit.internal;

public class Puppet {
    private int numberOfPuppetShows;
    private String puppetActName;
    private String puppetShowPlace;

    public Puppet(int numberOfPuppetShows, String puppetActName, String puppetShowPlace) {
        this.numberOfPuppetShows = numberOfPuppetShows;
        this.puppetActName = puppetActName;
        this.puppetShowPlace = puppetShowPlace;
        System.out.println("22. Running Puppet Constructor");
    }

    @Override
    public String toString() {
        return "Number of Puppet Shows: " + numberOfPuppetShows + ", Puppet Act Name: " + puppetActName +
                ", Puppet Show Place: " + puppetShowPlace;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 999;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Puppet) {
            Puppet otherPuppet = (Puppet) obj;
            return this.numberOfPuppetShows == otherPuppet.numberOfPuppetShows &&
                    this.puppetActName.equals(otherPuppet.puppetActName) &&
                    this.puppetShowPlace.equals(otherPuppet.puppetShowPlace);
        }
        return false;
    }
}
