package com.xworkz.lilyblossomstore.internal.lightsource;

public class LightSource {

        public LightSource() {
                System.out.println("Running LightSource Constructor in LightSource class - Parent class");
        }

        public void turnOn() {
                System.out.println("Turning on... - Parent class");
        }

        public void turnOff() {
                System.out.println("Turning off... - Parent class");
        }

        public void adjustBrightness() {
                System.out.println("Adjusting brightness... - Parent class");
        }

        public void changeColor() {
                System.out.println("Changing color... - Parent class");
        }

        public void saveEnergy() {
                System.out.println("Saving energy... - Parent class");
        }
}
