package com.xworkz.late.internal.tpackage;

public class TwoRoads implements Bridge {
    public TwoRoads() {
        super();
        System.out.println("No arg constructor of TwoRoads");
    }

    @Override
    public void connect() {
        System.out.println("Overriding Bridge - Bridge is connecting two roads");
    }
}
