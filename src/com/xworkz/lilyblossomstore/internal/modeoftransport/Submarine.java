package com.xworkz.lilyblossomstore.internal.modeoftransport;

public class Submarine extends Watercraft {
    public Submarine() {
        super();
        System.out.println("Submarine is diving underwater. - Child class");
    }

    @Override
    public void startEngine() {
        System.out.println("Watercraft engine started. - Child class");
    }

    @Override
    public void stopEngine() {
        System.out.println("Watercraft engine stopped. - Child class");
    }

    @Override
    public void sail() {
        System.out.println("Watercraft is sailing. - Child class");
    }

    @Override
    public void anchor() {
        System.out.println("Watercraft is anchored. - Child class");
    }

    @Override
    public void blowHorn() {
        System.out.println("Watercraft horn blown. - Child class");
    }
}
