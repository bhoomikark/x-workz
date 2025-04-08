package com.xworkz.lilyblossomstore.internal.aerialvehicle;

public class UnmannedAerialVehicle {
    public UnmannedAerialVehicle()
    {
        System.out.println("Running Unmanned vehicle constructor");
    }
    public void powerOn() { System.out.println("Drone powered on."); }
    public void takeOff() { System.out.println("Drone is taking off."); }
    public void fly() { System.out.println("Drone is flying."); }
    public void land() { System.out.println("Drone is landing."); }
    public void capturePhoto() { System.out.println("Drone captured a photo."); }
}
