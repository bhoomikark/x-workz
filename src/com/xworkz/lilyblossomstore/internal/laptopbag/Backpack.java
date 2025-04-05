package com.xworkz.lilyblossomstore.internal.laptopbag;

public class Backpack extends LaptopBag {
    public Backpack() {
        super();
        System.out.println("Running Backpack Constructor ");
    }

    @Override
    public void open() {
        System.out.println("Opening the backpack - Child class.");
    }

    @Override
    public void close() {
        System.out.println("Closing the backpack - Child class.");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the backpack - Child class.");
    }

    @Override
    public void adjustStrap() {
        System.out.println("Adjusting the backpack strap - Child class.");
    }

    @Override
    public void storeLaptop() {
        System.out.println("Storing the laptop in the backpack - Child class.");
    }
}
