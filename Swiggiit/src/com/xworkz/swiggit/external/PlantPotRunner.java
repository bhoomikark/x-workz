package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.PlantPot;

public class PlantPotRunner {
    public static void main(String[] args) {
        PlantPot pot = new PlantPot("Ceramic", "Succulent", true);
        System.out.println(pot);
        System.out.println("Overridden HashCode: " + pot.hashCode());
    }
}
