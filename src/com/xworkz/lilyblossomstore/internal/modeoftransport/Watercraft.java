package com.xworkz.lilyblossomstore.internal.modeoftransport;

public class Watercraft {
    public Watercraft() {
        System.out.println("Running watercraft constructor - Parent class");
    }

    public void startEngine() {
        System.out.println("Watercraft engine started. - Parent class");
    }

    public void stopEngine() {
        System.out.println("Watercraft engine stopped. - Parent class");
    }

    public void sail() {
        System.out.println("Watercraft is sailing. - Parent class");
    }

    public void anchor() {
        System.out.println("Watercraft is anchored. - Parent class");
    }

    public void blowHorn() {
        System.out.println("Watercraft horn blown. - Parent class");
    }
}
