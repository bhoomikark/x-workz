package com.xworkz.lilyblossomstore.internal.plant;

public class Cactus extends Plant {

    public Cactus() {
        super();
        System.out.println("Running Cactus Constructor");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Child class");
        System.out.println("Cactus photosynthesizes with minimal water...");
    }

    @Override
    public void absorbWater() {
        System.out.println("Child class");
        System.out.println("Cactus absorbs water through its roots efficiently...");
    }

    @Override
    public void grow() {
        System.out.println("Child class");
        System.out.println("Cactus grows slowly in arid climates...");
    }

    @Override
    public void produceOxygen() {
        System.out.println("Child class");
        System.out.println("Cactus produces oxygen even at night...");
    }

    @Override
    public void reproduce() {
        System.out.println("Child class");
        System.out.println("Cactus reproduces using seeds and offshoots...");
    }
}
