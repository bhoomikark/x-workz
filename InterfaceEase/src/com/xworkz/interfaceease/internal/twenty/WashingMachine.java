package com.xworkz.interfaceease.internal.twenty;

public class WashingMachine implements Device {
    @Override
    public void powerOn() {
        System.out.println("Washing Machine powered ON.");
    }
    @Override
    public void performFunction() {
        System.out.println("Washing clothes...");
    }
    @Override
    public void powerOff() {
        System.out.println("Washing Machine powered OFF.");
    }
@Override
    public void reboot()
    {
        System.out.println("perform reboot -- washing machine");
    }
}
