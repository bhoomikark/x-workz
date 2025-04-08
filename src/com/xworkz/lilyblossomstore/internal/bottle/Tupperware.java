package com.xworkz.lilyblossomstore.internal.bottle;

public class Tupperware {
    public void noOfBottle(Bottle bottle) {
        System.out.println("\nInside Tupperware class");

        bottle.fill();
        bottle.pour();
        bottle.closeCap();
        bottle.checkMaterial();
        bottle.checkCapacity();

        if (bottle instanceof Thermos) {
            System.out.println("Casting Bottle to Thermos to access insulationInfo method...");
            Thermos thermos = (Thermos) bottle;
            thermos.insulationInfo();
        }
    }
}
