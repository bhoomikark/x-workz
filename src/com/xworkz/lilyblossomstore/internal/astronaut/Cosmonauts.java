package com.xworkz.lilyblossomstore.internal.astronaut;

public class Cosmonauts {
    public void spaceResearch(Astronaut astronaut) {
        System.out.println("\nInside Cosmonauts class - Handling astronaut-related logic...");

        astronaut.train();
        astronaut.spaceWalk();
        astronaut.research();
        astronaut.eatSpaceFood();
        astronaut.communicate();

        if (astronaut instanceof SpaceTourist) {
            System.out.println("Casting Astronaut to SpaceTourist to access takePhotos method...");
            SpaceTourist tourist = (SpaceTourist) astronaut;
            tourist.takePhotos();
        }
    }
}
