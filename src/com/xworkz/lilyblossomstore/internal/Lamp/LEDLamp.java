package com.xworkz.lilyblossomstore.internal.Lamp;

public class LEDLamp extends Lamp {

    public LEDLamp() {
        super();
        System.out.println("Running LEDLamp Constructor in Child class");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the LED lamp - Child class");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the LED lamp - Child class");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Adjusting LED lamp brightness - Child class");
    }

    @Override
    public void changeBulb() {
        System.out.println("Changing LED bulb - Child class");
    }

    @Override
    public void checkPowerConsumption() {
        System.out.println("Checking LED power consumption - Child class");
    }
}
