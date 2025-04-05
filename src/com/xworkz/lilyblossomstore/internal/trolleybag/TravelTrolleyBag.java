package com.xworkz.lilyblossomstore.internal.trolleybag;

public class TravelTrolleyBag extends TrolleyBag {
    public TravelTrolleyBag() {
        super();
        System.out.println("Running TravelTrolleyBag Constructor in TravelTrolleyBag class");
    }

    @Override
    public void storeItems() {
        System.out.println("Child class");
        System.out.println("TravelTrolleyBag stores travel essentials.");
    }

    @Override
    public void roll() {
        System.out.println("Child class");
        System.out.println("TravelTrolleyBag rolls smoothly for easy travel.");
    }

    @Override
    public void extendHandle() {
        System.out.println("Child class");
        System.out.println("TravelTrolleyBag handle extended for convenient pulling.");
    }

    @Override
    public void lock() {
        System.out.println("Child class");
        System.out.println("TravelTrolleyBag locked securely with TSA lock.");
    }

    @Override
    public void unzip() {
        System.out.println("Child class");
        System.out.println("TravelTrolleyBag unzipped to open compartments.");
    }
}
