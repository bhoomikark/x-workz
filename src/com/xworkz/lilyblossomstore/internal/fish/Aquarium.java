package com.xworkz.lilyblossomstore.internal.fish;

public class Aquarium {
    public void diffFish(Fish fish) {
        System.out.println("\nInside Aquarium class");

        fish.swim();
        fish.breatheUnderwater();
        fish.layEggs();
        fish.getColor();
        fish.getSize();

        if (fish instanceof GoldFish) {
            System.out.println("Casting Fish to GoldFish to access goldFishType method...");
            GoldFish goldFish = (GoldFish) fish;
            goldFish.goldFishType();
        }
    }
}
