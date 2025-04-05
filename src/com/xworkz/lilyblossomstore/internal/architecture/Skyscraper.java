package com.xworkz.lilyblossomstore.internal.architecture;

public class Skyscraper extends Home {
    public Skyscraper() {
        super();
        System.out.println("Child Class");
        System.out.println("Skyscraper is a very tall building...");
    }

    @Override
    public void provideShelter() {
        System.out.println("Child Class");
        System.out.println("Skyscraper provides shelter to many families...");
    }

    @Override
    public void hasFloors() {
        System.out.println("Child Class");
        System.out.println("Skyscraper has dozens of floors...");
    }

    @Override
    public void hasWindows() {
        System.out.println("Child Class");
        System.out.println("Skyscraper has many glass windows...");
    }

    @Override
    public void supportsElectricity() {
        System.out.println("Child Class");
        System.out.println("Skyscraper supports advanced electrical systems...");
    }

    @Override
    public void hasSecurity() {
        System.out.println("Child Class");
        System.out.println("Skyscraper has high-tech security systems...");
    }
}

