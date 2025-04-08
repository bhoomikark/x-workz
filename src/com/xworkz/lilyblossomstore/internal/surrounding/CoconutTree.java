package com.xworkz.lilyblossomstore.internal.surrounding;

public class CoconutTree {
    public void noOfCoconut(Tree tree) {
        System.out.println("\nChecking the tree type...");

        tree.grow();
        tree.photosynthesize();
        tree.shedLeaves();
        tree.bearFruit();
        tree.provideOxygen();

        if (tree instanceof Oak) {
            System.out.println("Casting Tree to Oak to display woodType...");
            Oak oak = (Oak) tree;
            oak.woodType();
        }
    }
}
