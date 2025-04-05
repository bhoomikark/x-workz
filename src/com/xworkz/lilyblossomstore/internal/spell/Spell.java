package com.xworkz.lilyblossomstore.internal.spell;

public class Spell {
    public Spell() {
        System.out.println("Running Spell Constructor in Spell class");
    }

    public void chant() {
        System.out.println("Parent class");
        System.out.println("Chanting magical words...");
    }

    public void releasePower() {
        System.out.println("Parent class");
        System.out.println("Releasing mystical energy...");
    }

    public void duration() {
        System.out.println("Parent class");
        System.out.println("The spell lasts for 5 minutes...");
    }

    public void source() {
        System.out.println("Parent class");
        System.out.println("Magic comes from nature...");
    }
}
