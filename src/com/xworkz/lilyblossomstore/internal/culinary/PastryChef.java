package com.xworkz.lilyblossomstore.internal.culinary;

public class PastryChef extends Chef {
    public PastryChef() {
        super();
        System.out.println("Child Class");
        System.out.println("Pastry chef specializes in baking...");
    }

    @Override
    public void cook() {
        System.out.println("Child Class");
        System.out.println("Pastry chef is baking pastries...");
    }

    @Override
    public void chop() {
        System.out.println("Child Class");
        System.out.println("Pastry chef is chopping fruits for desserts...");
    }

    @Override
    public void season() {
        System.out.println("Child Class");
        System.out.println("Pastry chef is sprinkling powdered sugar...");
    }

    @Override
    public void plateDish() {
        System.out.println("Child Class");
        System.out.println("Pastry chef is beautifully plating desserts...");
    }

    @Override
    public void taste() {
        System.out.println("Child Class");
        System.out.println("Pastry chef is tasting the final pastry...");
    }
}
