package com.xworkz.late.internal.bpackage;

public class FanImpl implements Wire {
    public FanImpl() {
        super();
        System.out.println("No arg constructor of FanImpl");
    }
    @Override
    public void supply() {
        System.out.println("Overriding Wire - supplying power to fan");
    }
}
