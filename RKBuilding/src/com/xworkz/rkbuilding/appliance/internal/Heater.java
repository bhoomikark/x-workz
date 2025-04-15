package com.xworkz.rkbuilding.appliance.internal;

public class Heater extends Appliance {
    public Heater()
    {
        System.out.println("Running no arg constructor");
    }
    @Override
    public void performFunction()
    {
        System.out.println("Water is heating in heater");
    }
    @Override
    public void plugIn()
    {
        System.out.println("You TurnOFF the heater");
    }

}
