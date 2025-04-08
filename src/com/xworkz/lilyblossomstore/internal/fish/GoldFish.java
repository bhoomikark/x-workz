package com.xworkz.lilyblossomstore.internal.fish;

public class GoldFish extends Fish {
    public GoldFish() {
        super();

        System.out.println("Running Goldfish Constructor in Goldfish class");
    }

    @Override
    public void swim() {
        System.out.println("Child Class");
        System.out.println("Goldfish is swimming gracefully");
    }

    @Override
    public void breatheUnderwater() {
        System.out.println("Child Class");
        System.out.println("Goldfish is breathing through gills");
    }

    @Override
    public void layEggs() {
        System.out.println("Child Class");
        System.out.println("Goldfish is laying eggs in water");
    }

    @Override
    public void getColor() {
        System.out.println("Child Class");
        System.out.println("Goldfish color is golden-orange");
    }

    @Override
    public void getSize() {
        System.out.println("Child Class");
        System.out.println("Goldfish size is medium");
    }
    public void goldFishType() {
        System.out.println("Child Class");
        System.out.println("This is a fancy tail GoldFish...");
    }
}
