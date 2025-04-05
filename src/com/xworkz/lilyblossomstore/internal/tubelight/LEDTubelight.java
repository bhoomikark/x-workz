package com.xworkz.lilyblossomstore.internal.tubelight;

public class LEDTubelight extends Tubelight {
    public LEDTubelight() {
        super();
        System.out.println("No-argument constructor of LEDTubelight");
    }

    @Override
    public void turnOn() {
        System.out.println("Child class");
        System.out.println("Turning on the LED tubelight with bright light.");
    }

    @Override
    public void turnOff() {
        System.out.println("Child class");
        System.out.println("LED tubelight is turned off silently.");
    }

    @Override
    public void flicker() {
        System.out.println("Child class");
        System.out.println("LED tubelight rarely flickers.");
    }

    @Override
    public void repair() {
        System.out.println("Child class");
        System.out.println("Repairing the LED circuit.");
    }

    @Override
    public void replace() {
        System.out.println("Child class");
        System.out.println("Replacing the LED panel.");
    }
}
