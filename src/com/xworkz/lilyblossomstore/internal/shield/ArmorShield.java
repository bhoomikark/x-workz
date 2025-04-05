package com.xworkz.lilyblossomstore.internal.shield;

public class ArmorShield extends Shield {
    public ArmorShield() {
        super();
        System.out.println("No-argument constructor of ArmorShield");
    }

    @Override
    public void block() {
        System.out.println("Child class");
        System.out.println("ArmorShield blocks with reinforced plating.");
    }

    @Override
    public void reflect() {
        System.out.println("Child class");
        System.out.println("ArmorShield reflects the blow with heavy resistance.");
    }

    @Override
    public void absorbImpact() {
        System.out.println("Child class");
        System.out.println("ArmorShield absorbs major impact with layered defense.");
    }

    @Override
    public void repair() {
        System.out.println("Child class");
        System.out.println("ArmorShield is being repaired with strong alloys.");
    }

    @Override
    public void enhance() {
        System.out.println("Child class");
        System.out.println("ArmorShield is enhanced with magical strength.");
    }
}
