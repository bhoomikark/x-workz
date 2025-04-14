package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.PlantPot;

public class PlantPotRunner {
    public static void main(String[] args) {
        PlantPot pot = new PlantPot("Ceramic", "Succulent", true);
        System.out.println(pot);
        System.out.println("Overridden HashCode: " + pot.hashCode());
        PlantPot pot1 = new PlantPot("Ceramic", "Succulent", true);
        PlantPot pot2 = new PlantPot("Plastic", "Cactus", false);

        System.out.println("pot.equals(pot1)? " + pot.equals(pot1));
        System.out.println("pot.equals(pot2)? " + pot.equals(pot2));

    }
}
