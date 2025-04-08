package com.xworkz.lilyblossomstore.internal.potion;

public class PoisonousPotion {
    public void harm(Potion potion) {
        System.out.println("\nInside PoisonousPotion class - Examining the potion...");

        potion.taste();
        potion.effect();
        potion.duration();
        potion.ingredients();

        if (potion instanceof HealingPotion) {
            System.out.println("Casting Potion to HealingPotion to access boostRecovery method...");
            HealingPotion healing = (HealingPotion) potion;
            healing.boostRecovery();
        }
    }
}
