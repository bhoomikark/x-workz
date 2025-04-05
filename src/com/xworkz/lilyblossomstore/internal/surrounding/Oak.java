package com.xworkz.lilyblossomstore.internal.surrounding;

public class Oak extends Tree {
    public Oak() {
        super();
        System.out.println("Oak trees are strong and durable...");
    }

    @Override
    public void grow() {
        System.out.println("Child class");
        System.out.println("Oak tree grows steadily and lives for centuries...");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Child class");
        System.out.println("Oak tree photosynthesizes efficiently with large leaves...");
    }

    @Override
    public void shedLeaves() {
        System.out.println("Child class");
        System.out.println("Oak tree sheds leaves seasonally during autumn...");
    }

    @Override
    public void bearFruit() {
        System.out.println("Child class");
        System.out.println("Oak tree bears acorns as its fruit...");
    }

    @Override
    public void provideOxygen() {
        System.out.println("Child class");
        System.out.println("Oak tree provides abundant oxygen through dense foliage...");
    }
}
