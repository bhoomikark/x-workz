package com.xworkz.lilyblossomstore.internal.hairs;

public class CurlyHairs extends Hairs {
    public CurlyHairs() {
        super();
        System.out.println("Child Class");
        System.out.println("Running CurlyHairs Constructor in CurlyHairs class");
    }

    @Override
    public void grow() {
        System.out.println("Child Class");
        System.out.println("Curly hairs grow in spirals or waves.");
    }

    @Override
    public void cut() {
        System.out.println("Child Class");
        System.out.println("Cutting curly hair requires special techniques.");
    }

    @Override
    public void wash() {
        System.out.println("Child Class");
        System.out.println("Curly hairs need sulfate-free shampoos while washing.");
    }

    @Override
    public void comb() {
        System.out.println("Child Class");
        System.out.println("Curly hairs should be combed with wide-tooth combs.");
    }

    @Override
    public void style() {
        System.out.println("Child Class");
        System.out.println("Curly hairs can be styled into coils, puffs, or twists.");
    }
}
