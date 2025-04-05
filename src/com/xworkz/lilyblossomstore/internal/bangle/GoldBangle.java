package com.xworkz.lilyblossomstore.internal.bangle;

public class GoldBangle extends Bangle {

    public GoldBangle() {
        super();
        System.out.println("Child Class");
        System.out.println("Running GoldBangle Constructor in GoldBangle class");
    }

    @Override
    public void wear() {
        System.out.println("Child Class");
        System.out.println("Wearing a gold bangle.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing the gold bangle.");
    }

    @Override
    public void clean() {
        System.out.println("Child Class");
        System.out.println("Cleaning the gold bangle with a soft cloth.");
    }

    @Override
    public void store() {
        System.out.println("Child Class");
        System.out.println("Storing the gold bangle in a jewelry box.");
    }

    @Override
    public void shine() {
        System.out.println("Child Class");
        System.out.println("Polishing the gold bangle to make it shine.");
    }

    public void checkPurity() {
        System.out.println("Child Class");
        System.out.println("Checking the purity of the gold bangle.");
    }
}
