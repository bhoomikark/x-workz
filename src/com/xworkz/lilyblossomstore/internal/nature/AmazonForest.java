package com.xworkz.lilyblossomstore.internal.nature;

public class AmazonForest {
    public void noOfTrees(Mountain mountain) {
        System.out.println("\nInside AmazonForest class - Inspecting Mountain details...");

        mountain.getHeight();
        mountain.isClimbable();
        mountain.hasSnow();
        mountain.location();
        mountain.ecosystem();

        if (mountain instanceof Everest) {
            System.out.println("Casting Mountain to Everest to access summit details...");
            Everest everest = (Everest) mountain;
            everest.summit();
        }
    }
}
