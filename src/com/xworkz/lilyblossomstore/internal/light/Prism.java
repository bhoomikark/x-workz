package com.xworkz.lilyblossomstore.internal.light;

public class Prism {
    public void checkLightType(LightSourcee light) {
        System.out.println("\nInspecting the light source...");

        light.lightColor();
        light.lightMaterial();
        light.lightSource();
        light.lightType();
        light.material();

        if (light instanceof Light) {
            System.out.println("Casting LightSourcee to Light to access brightness level...");
            Light ledLight = (Light) light;
            ledLight.brightnessLevel();
        }
    }
}
