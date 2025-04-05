package com.xworkz.lilyblossomstore.internal.soap;

public class HandSoap extends Soap {
    public HandSoap() {
        super();
        System.out.println("Running HerbalSoap Constructor in HerbalSoap class");
    }

    @Override
    public void clean() {
        System.out.println("Child class");
        System.out.println("Herbal soap cleans skin gently using natural extracts.");
    }

    @Override
    public void createFoam() {
        System.out.println("Child class");
        System.out.println("Herbal soap creates soft foam enriched with herbs.");
    }

    @Override
    public void washHands() {
        System.out.println("Child class");
        System.out.println("Washing hands with antibacterial herbal soap.");
    }

    @Override
    public void removeGerms() {
        System.out.println("Child class");
        System.out.println("Herbal soap removes germs using natural ingredients.");
    }

    @Override
    public void dry() {
        System.out.println("Child class");
        System.out.println("Herbal soap dries without leaving residue.");
    }
}
