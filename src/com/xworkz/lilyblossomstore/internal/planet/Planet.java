package com.xworkz.lilyblossomstore.internal.planet;

public class Planet {
    public Planet() {
        System.out.println("A new planet is formed... - Parent class");
    }

    public void rotate() {
        System.out.println("Planet is rotating... - Parent class");
    }

    public void revolve() {
        System.out.println("Planet is revolving around the sun... - Parent class");
    }

    public void hasAtmosphere() {
        System.out.println("Some planets have atmospheres... - Parent class");
    }

    public void containsWater() {
        System.out.println("Some planets have water... - Parent class");
    }

    public void supportsLife() {
        System.out.println("Very few planets support life... - Parent class");
    }
}
