package com.xworkz.lilyblossomstore.internal.barbie;

public class FashionDoll extends Barbie {
    public FashionDoll() {
        super();
        System.out.println("Child Class");
        System.out.println("Running FashionDoll Constructor in FashionDoll class");
    }

    @Override
    public void dressUp() {
        System.out.println("Child Class");
        System.out.println("Dressing up the Fashion Doll.");
    }

    @Override
    public void combHair() {
        System.out.println("Child Class");
        System.out.println("Combing Fashion Doll's hair.");
    }

    @Override
    public void play() {
        System.out.println("Child Class");
        System.out.println("Playing with the Fashion Doll.");
    }

    @Override
    public void changeShoes() {
        System.out.println("Child Class");
        System.out.println("Changing Fashion Doll's shoes.");
    }

    @Override
    public void sitDown() {
        System.out.println("Child Class");
        System.out.println("Making the Fashion Doll sit down.");
    }
}
