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
}
