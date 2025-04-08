package com.xworkz.lilyblossomstore.internal.dream;

public class GoodDreams {
    public void happinessDream(Dream dream) {
        System.out.println("\nInside GoodDreams class - Handling dream details...");

        dream.duration();
        dream.meaning();
        dream.remember();
        dream.influence();

        if (dream instanceof Nightmare) {
            System.out.println("Casting Dream to Nightmare to access wakeUpSuddenly method...");
            Nightmare nightmare = (Nightmare) dream;
            nightmare.wakeUpSuddenly();
        }
    }
}
