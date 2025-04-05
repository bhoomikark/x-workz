package com.xworkz.lilyblossomstore.internal.metal;

public class Aluminium extends Metal {
    public Aluminium() {
        super();
        System.out.println("No-argument constructor of Aluminium");
    }

    @Override
    public void getBoilingPoint() {
        System.out.println("Child Class");
        System.out.println("Running getBoilingPoint method in Aluminium class");
    }

    @Override
    public void getHardness() {
        System.out.println("Child Class");
        System.out.println("Running getHardness method in Aluminium class");
    }

    @Override
    public void checkCorrosionResistance() {
        System.out.println("Child Class");
        System.out.println("Running checkCorrosionResistance method in Aluminium class");
    }

    @Override
    public void conductHeat() {
        System.out.println("Child Class");
        System.out.println("Running conductHeat method in Aluminium class");
    }

    @Override
    public void isMalleable() {
        System.out.println("Child Class");
        System.out.println("Running isMalleable method in Aluminium class");
    }
}
