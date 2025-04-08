package com.xworkz.lilyblossomstore.internal.heroes;

public class MarvelHero {
    public void fight(SuperHero hero) {
        System.out.println("\nInside MarvelHero class - Observing hero's performance...");

        hero.fightCrime();
        hero.usePowers();
        hero.rescuePeople();
        hero.wearSuit();
        hero.getAlias();

        if (hero instanceof Spiderman) {
            System.out.println("Casting SuperHero to Spiderman to access swingWeb method...");
            Spiderman spiderman = (Spiderman) hero;
            spiderman.swingWeb();
        }
    }
}
