package com.xworkz.lilyblossomstore.internal.wheeler;

public class TwoWheeler {
    public TwoWheeler(){
        System.out.println("Running TwoWheeler Constructor");
    }

    public void startEngine() {
        System.out.println("Parent class");
        System.out.println("TwoWheeler engine started.");
    }

    public void stopEngine() {
        System.out.println("Parent class");
        System.out.println("TwoWheeler engine stopped.");
    }

    public void accelerate() {
        System.out.println("Parent class");
        System.out.println("TwoWheeler is accelerating.");
    }

    public void applyBrakes() {
        System.out.println("Parent class");
        System.out.println("Brakes applied on TwoWheeler.");
    }

    public void honk() {
        System.out.println("Parent class");
        System.out.println("TwoWheeler horn honked.");
    }
}