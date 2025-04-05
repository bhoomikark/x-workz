package com.xworkz.lilyblossomstore.internal.sticker;

public class Sticker {
    public Sticker() {
        System.out.println("Running Sticker Constructor in Sticker class");
    }

    public void peel() {
        System.out.println("Parent class");
        System.out.println("Sticker is being peeled.");
    }

    public void stick() {
        System.out.println("Parent class");
        System.out.println("Sticker is being applied.");
    }

    public void remove() {
        System.out.println("Parent class");
        System.out.println("Sticker is being removed.");
    }

    public void print() {
        System.out.println("Parent class");
        System.out.println("Sticker is being printed.");
    }

    public void decorate() {
        System.out.println("Parent class");
        System.out.println("Sticker is used for decoration.");
    }
}
