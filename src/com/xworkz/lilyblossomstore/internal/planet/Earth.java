package com.xworkz.lilyblossomstore.internal.planet;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("Earth is a habitable planet... - Child class");
    }

    @Override
    public void rotate() {
        System.out.println("Earth rotates once every 24 hours... - Child class");
    }

    @Override
    public void revolve() {
        System.out.println("Earth revolves around the Sun in 365 days... - Child class");
    }

    @Override
    public void hasAtmosphere() {
        System.out.println("Earth has a life-supporting atmosphere... - Child class");
    }

    @Override
    public void containsWater() {
        System.out.println("Earth has 71% of its surface covered with water... - Child class");
    }

    @Override
    public void supportsLife() {
        System.out.println("Earth is the only known planet that supports life... - Child class");
    }
    public void climateZone() {
        System.out.println("Earth has various climate zones.");
    }
}
