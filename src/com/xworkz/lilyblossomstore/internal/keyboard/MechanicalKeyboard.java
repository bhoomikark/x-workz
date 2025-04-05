package com.xworkz.lilyblossomstore.internal.keyboard;

public class MechanicalKeyboard extends Keyboard {
    public MechanicalKeyboard() {
        super();
        System.out.println("Child Class");
        System.out.println("Running MechanicalKeyboard Constructor in MechanicalKeyboard class");
    }

    @Override
    public void type() {
        System.out.println("Child Class");
        System.out.println("Mechanical keyboard provides tactile feedback while typing.");
    }

    @Override
    public void pressKey() {
        System.out.println("Child Class");
        System.out.println("Mechanical key press produces a clicking sound.");
    }

    @Override
    public void backlight() {
        System.out.println("Child Class");
        System.out.println("Mechanical keyboards offer RGB backlighting options.");
    }
}
