package com.xworkz.lilyblossomstore.internal.Lamp;

public class BatteryLamp {
    public void lifeSpan(Lamp lamp) {
        System.out.println("\nInside BatteryLamp class");

        lamp.turnOn();
        lamp.turnOff();
        lamp.adjustBrightness();
        lamp.changeBulb();
        lamp.checkPowerConsumption();

        if (lamp instanceof LEDLamp) {
            System.out.println("Casting Lamp to LEDLamp to access child-specific method...");
            LEDLamp led = (LEDLamp) lamp;
            led.checkColorTemperature();
        }
    }
}
