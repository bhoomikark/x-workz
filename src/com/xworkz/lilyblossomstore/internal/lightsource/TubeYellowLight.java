package com.xworkz.lilyblossomstore.internal.lightsource;

public class TubeYellowLight {
    public void colorOfLight(LightSource light) {
        System.out.println("\nRunning colorOfLight(LightSource light)");
        System.out.println("=========================================");
        light.turnOn();
        light.turnOff();
        light.adjustBrightness();
        light.changeColor();
        light.saveEnergy();

        if (light instanceof LED) {
            System.out.println("Casting to LED...");
            LED led = (LED) light;
            led.ledType();
        }
    }
}
