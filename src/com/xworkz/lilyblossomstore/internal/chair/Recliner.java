package com.xworkz.lilyblossomstore.internal.chair;

public class Recliner extends Chair {

    public Recliner() {
        super();
        System.out.println("Child Class");
        System.out.println("Running Recliner Constructor in Recliner class");
    }

    @Override
    public void sit() {
        System.out.println("Child Class");
        System.out.println("Sitting comfortably on the recliner");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Child Class");
        System.out.println("Adjusting recliner height");
    }

    @Override
    public void recline() {
        System.out.println("Child Class");
        System.out.println("Reclining the recliner smoothly");
    }

    @Override
    public void checkMaterial() {
        System.out.println("Child Class");
        System.out.println("Checking premium recliner material");
    }

    @Override
    public void checkComfort() {
        System.out.println("Child Class");
        System.out.println("Evaluating recliner comfort level");
    }
    public void remoteControlFeatures() {
        System.out.println("Child Class");
        System.out.println("Recliner has remote control features for adjusting angles...");
    }
}
