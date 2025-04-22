package com.xworkz.late.internal.ipackage;

public class TrafficPolice implements TrafficSignals {
    public TrafficPolice() {
        super();
        System.out.println("No arg constructor of TrafficPolice");
    }

    @Override
    public void control() {
        System.out.println("Overriding TrafficSignals - Traffic police controlling the signals");
    }
}
