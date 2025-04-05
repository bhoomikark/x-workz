package com.xworkz.lilyblossomstore.internal.belt;

public class LeatherBelt extends Belt {
    public LeatherBelt() {
        super();
        System.out.println("Running LeatherBelt Constructor in LeatherBelt class");
    }

    @Override
    public void wear() {
        System.out.println("Child Class");
        System.out.println("Wearing the leather belt.");
    }

    @Override
    public void adjust() {
        System.out.println("Child Class");
        System.out.println("Adjusting the leather belt.");
    }

    @Override
    public void remove() {
        System.out.println("Child Class");
        System.out.println("Removing the leather belt.");
    }

    @Override
    public void buckle() {
        System.out.println("Child Class");
        System.out.println("Buckling the leather belt.");
    }

    @Override
    public void tighten() {
        System.out.println("Child Class");
        System.out.println("Tightening the leather belt.");
    }
}
