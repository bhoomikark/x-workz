package com.xworkz.lilyblossomstore.internal.spell;

public class FireSpell extends Spell {
    public FireSpell() {
        super();
        System.out.println("Running FireSpell Constructor in FireSpell class");
    }

    @Override
    public void chant() {
        System.out.println("Child class");
        System.out.println("Chanting fiery incantations for flames...");
    }

    @Override
    public void releasePower() {
        System.out.println("Child class");
        System.out.println("Unleashing a burst of intense fire magic...");
    }

    @Override
    public void duration() {
        System.out.println("Child class");
        System.out.println("Fire spell burns brightly for a short duration...");
    }

    @Override
    public void source() {
        System.out.println("Child class");
        System.out.println("Fire spell draws energy from volcanic forces...");
    }
    public void flameIntensity() {
        System.out.println("Flame intensity is at maximum level!");
    }
}
