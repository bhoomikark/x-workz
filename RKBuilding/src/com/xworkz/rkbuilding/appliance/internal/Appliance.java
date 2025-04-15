package com.xworkz.rkbuilding.appliance.internal;

public abstract class Appliance {
    public Appliance()
    {
        System.out.println("Running Appliance Constructor");
    }
    public abstract void performFunction();

    public void plugIn()
    {
        System.out.println("The heater is turned ON");
    }



}
