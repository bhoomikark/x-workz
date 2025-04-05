package com.xworkz.lilyblossomstore.internal.cover;

public class MobileCover extends Cover {
    public MobileCover() {
        super();
        System.out.println("Running MobileCover Constructor in MobileCover class");
    }

    @Override
    public void protect() {
        System.out.println("Child Class");
        System.out.println("Mobile cover is protecting the phone.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing the mobile cover.");
    }

    @Override
    public void clean() {
        System.out.println("Child Class");
        System.out.println("Cleaning the mobile cover.");
    }

    @Override
    public void fold() {
        System.out.println("Child Class");
        System.out.println("Folding the mobile cover.");
    }

    @Override
    public void replace() {
        System.out.println("Child Class");
        System.out.println("Replacing the mobile cover.");
    }
}
