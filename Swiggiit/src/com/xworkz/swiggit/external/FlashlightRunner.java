package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Flashlight;

public class FlashlightRunner {
    public static void main(String[] args) {
        Flashlight light = new Flashlight("LED", 8, true);
        System.out.println(light);
        System.out.println("Flashlight HashCode: " + light.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(light));
        Flashlight light1 = new Flashlight("LED", 8, true);
        Flashlight light2 = new Flashlight("LED", 6, false);
        boolean result = light1.equals(light2);
        System.out.println("Are both flashlights equal? " + result);
    }
}
