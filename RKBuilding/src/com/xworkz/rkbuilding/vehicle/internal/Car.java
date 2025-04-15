package com.xworkz.rkbuilding.vehicle.internal;

public class Car extends Vehicle {
    public Car()
    {
        System.out.println("no arg constructor");
    }
    @Override
    public void startEngine()
    {
        System.out.println("Running Start engine in car");
    }

}
