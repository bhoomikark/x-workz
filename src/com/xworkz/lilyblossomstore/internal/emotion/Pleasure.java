package com.xworkz.lilyblossomstore.internal.emotion;

public class Pleasure {
    public void express(Emotion emotion) {
        System.out.println("\nInside Pleasure class handling emotion...");

        emotion.trigger();
        emotion.intensity();
        emotion.cause();
        emotion.express();
        emotion.duration();

        if (emotion instanceof Happiness) {
            System.out.println("Casting Emotion to Happiness to access shareHappiness method...");
            Happiness happy = (Happiness) emotion;
            happy.shareHappiness();
        }
    }
}
