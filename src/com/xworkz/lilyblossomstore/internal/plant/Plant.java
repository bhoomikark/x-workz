package com.xworkz.lilyblossomstore.internal.plant;

public class Plant {

    public Plant() {
        System.out.println("Running Plant Constructor");
    }

    public void photosynthesize() {
        System.out.println("Parent class");
        System.out.println("Plant is photosynthesizing...");
    }

    public void absorbWater() {
        System.out.println("Parent class");
        System.out.println("Plant is absorbing water...");
    }

    public void grow() {
        System.out.println("Parent class");
        System.out.println("Plant is growing...");
    }

    public void produceOxygen() {
        System.out.println("Parent class");
        System.out.println("Plant is producing oxygen...");
    }

    public void reproduce() {
        System.out.println("Parent class");
        System.out.println("Plant is reproducing...");
    }
}
