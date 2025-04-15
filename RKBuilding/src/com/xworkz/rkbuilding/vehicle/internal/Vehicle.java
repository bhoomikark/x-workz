package com.xworkz.rkbuilding.vehicle.internal;

public abstract class Vehicle {
    public Vehicle()
    {
        System.out.println("Running Vehicle Constructor of Parent class");
    }
    public  abstract void startEngine();

}
