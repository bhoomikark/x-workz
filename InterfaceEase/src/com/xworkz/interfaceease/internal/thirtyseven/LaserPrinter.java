package com.xworkz.interfaceease.internal.thirtyseven;

public class LaserPrinter implements Printer {
    @Override
    public void startPrint() {
        System.out.println("Laser Printer started printing...");
    }

    @Override
    public void cancelPrint() {
        System.out.println("Laser Printer printing canceled.");
    }

    @Override
    public void finishPrint() {
        System.out.println("Laser Printer finished printing.");
    }
@Override
    public void print()
    {
        System.out.println("print -- laser printer");
    }
}
