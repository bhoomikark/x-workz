package com.xworkz.lilyblossomstore.internal.switchboard;

public class SmartSwitchboard extends Switchboard {
    public SmartSwitchboard() {
        super();
        System.out.println("Child class");
        System.out.println("Running SmartSwitchboard Constructor in SmartSwitchboard class");
    }

    @Override
    public void turnOn() {
        System.out.println("Child class");
        System.out.println("SmartSwitchboard is turning on remotely.");
    }

    @Override
    public void turnOff() {
        System.out.println("Child class");
        System.out.println("SmartSwitchboard is turning off remotely.");
    }

    @Override
    public void supplyPower() {
        System.out.println("Child class");
        System.out.println("SmartSwitchboard is supplying smart-controlled power.");
    }

    @Override
    public void repair() {
        System.out.println("Child class");
        System.out.println("SmartSwitchboard is diagnosing and repairing automatically.");
    }

    @Override
    public void replaceFuse() {
        System.out.println("Child class");
        System.out.println("SmartSwitchboard alerts for fuse replacement.");
    }
}
