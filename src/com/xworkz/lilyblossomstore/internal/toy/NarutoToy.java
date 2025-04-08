package com.xworkz.lilyblossomstore.internal.toy;

public class NarutoToy {
    public void gadget(Toy toy) {
        System.out.println("\nInside NarutoToy class");

        toy.play();
        toy.getMaterial();
        toy.checkBattery();
        toy.move();
        toy.getColor();

        if (toy instanceof RemoteControlCar) {
            System.out.println("Casting Toy to RemoteControlCar to access remoteRange method...");
            RemoteControlCar remote = (RemoteControlCar) toy;
            remote.remoteRange();
        }
    }
}
