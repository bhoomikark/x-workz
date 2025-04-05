package com.xworkz.lilyblossomstore.internal.lightsource;

public class LED extends LightSource {

    public LED() {
        super();
        System.out.println("Running LED Constructor in LED class - Child class");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on... - Child class");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off... - Child class");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting brightness... - Child class");
    }

    @Override
    public void changeColor() {
        System.out.println("Changing color... - Child class");
    }

    @Override
    public void saveEnergy() {
        System.out.println("Saving energy... - Child class");
    }
}
