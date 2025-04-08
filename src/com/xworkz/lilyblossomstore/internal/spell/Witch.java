package com.xworkz.lilyblossomstore.internal.spell;

public class Witch {
    public void magicBottle(Spell spell) {
        System.out.println("\nInside Witch class performing magicBottle...");

        spell.chant();
        spell.releasePower();
        spell.duration();
        spell.source();

        if (spell instanceof FireSpell) {
            System.out.println("Casting Spell to FireSpell to access flameIntensity method...");
            FireSpell fire = (FireSpell) spell;
            fire.flameIntensity();
        }
    }
}
