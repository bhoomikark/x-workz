package com.xworkz.lilyblossomstore.internal.soap;

public class Soap {
    public Soap() {
        System.out.println("Running Soap Constructor in Soap class");
    }

    public void clean() {
        System.out.println("Parent class");
        System.out.println("Soap is cleaning.");
    }

    public void createFoam() {
        System.out.println("Parent class");
        System.out.println("Soap is creating foam.");
    }

    public void washHands() {
        System.out.println("Parent class");
        System.out.println("Washing hands with soap.");
    }

    public void removeGerms() {
        System.out.println("Parent class");
        System.out.println("Soap is removing germs.");
    }

    public void dry() {
        System.out.println("Parent class");
        System.out.println("Soap is drying after use.");
    }
}
