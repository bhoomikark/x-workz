package com.xworkz.lilyblossomstore.internal.chair;

public class ChairTester {
    public void checkChair(Chair chair) {
        System.out.println("\nInside ChairTester class");

        chair.sit();
        chair.adjustHeight();
        chair.recline();
        chair.checkMaterial();
        chair.checkComfort();

        if (chair instanceof Recliner) {
            System.out.println("Casting Chair to Recliner to access remoteControlFeatures method...");
            Recliner recliner = (Recliner) chair;
            recliner.remoteControlFeatures();
        }
    }
}
