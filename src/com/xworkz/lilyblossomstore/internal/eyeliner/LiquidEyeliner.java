package com.xworkz.lilyblossomstore.internal.eyeliner;

public class LiquidEyeliner extends Eyeliner {
    public LiquidEyeliner() {
        super();

        System.out.println("Running LiquidEyeliner Constructor in LiquidEyeliner class");
    }

    @Override
    public void apply() {
        System.out.println("Child Class");
        System.out.println("Applying liquid eyeliner precisely.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing liquid eyeliner with remover.");
    }

    @Override
    public void smudge() {
        System.out.println("Child Class");
        System.out.println("Liquid eyeliner is smudge-proof.");
    }

    @Override
    public void dry() {
        System.out.println("Child Class");
        System.out.println("Liquid eyeliner dries quickly.");
    }

    @Override
    public void longLasting() {
        System.out.println("Child Class");
        System.out.println("Liquid eyeliner lasts all day.");
    }
}
