package com.xworkz.lilyblossomstore.internal.plant;

public class SpinePlant {
    public void noOfSpines(Plant plant) {
        System.out.println("\nInside SpinePlant class");

        plant.photosynthesize();
        plant.absorbWater();
        plant.grow();
        plant.produceOxygen();
        plant.reproduce();

        if (plant instanceof Cactus) {
            System.out.println("Casting Plant to Cactus to access child-specific method...");
            Cactus cactus = (Cactus) plant;
            cactus.storeWater();
        }
    }
}
