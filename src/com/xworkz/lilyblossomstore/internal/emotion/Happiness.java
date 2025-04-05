package com.xworkz.lilyblossomstore.internal.emotion;

public class Happiness extends Emotion {
    public Happiness() {
        super();
        System.out.println("Child Class");
        System.out.println("Happiness spreads positivity...");
    }

    @Override
    public void intensity() {
        System.out.println("Child Class");
        System.out.println("Happiness can be overwhelming or subtle...");
    }

    @Override
    public void duration() {
        System.out.println("Child Class");
        System.out.println("Happiness may be momentary or lasting...");
    }

    @Override
    public void trigger() {
        System.out.println("Child Class");
        System.out.println("Happiness is triggered by joyful events...");
    }

    @Override
    public void express() {
        System.out.println("Child Class");
        System.out.println("People express happiness through smiles and laughter...");
    }

    @Override
    public void cause() {
        System.out.println("Child Class");
        System.out.println("The cause for happiness is satisfaction and good news...");
    }
}
