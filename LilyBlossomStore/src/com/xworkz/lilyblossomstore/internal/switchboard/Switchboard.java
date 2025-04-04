package com.xworkz.lilyblossomstore.internal.switchboard;

public class Switchboard {
    public Switchboard() {
        System.out.println("Running Switchboard Constructor in Switchboard class");
    }

    public void turnOn() {
        System.out.println("Turning on the switch.");
    }

    public void turnOff() {
        System.out.println("Turning off the switch.");
    }

    public void supplyPower() {
        System.out.println("Supplying power through the switchboard.");
    }

    public void repair() {
        System.out.println("Repairing the switchboard.");
    }

    public void replaceFuse() {
        System.out.println("Replacing the fuse in the switchboard.");
    }
}
