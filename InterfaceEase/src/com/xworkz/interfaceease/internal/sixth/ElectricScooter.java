package com.xworkz.interfaceease.internal.sixth;

public class ElectricScooter implements ElectricVehicle{
    @Override
    public void charge() {
        System.out.println("Car is charging. -- Electric scooter");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Car battery is full. -- Electric scooter");
    }

    @Override
    public void batteryOn() {
        System.out.println("Battery ON -- Electric scooter");
    }
@Override
    public void checkmilage()
    {
        System.out.println("check milage -- Electric scotter");
    }
}
