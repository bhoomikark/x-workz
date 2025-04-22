package com.xworkz.late.internal.fpackage;

public class Steel implements Alloy {
    public Steel() {
        super();
        System.out.println("No arg constructor of Steel");
    }

    @Override
    public void mix() {
        System.out.println("Overriding Alloy - Steel is being mixed");
    }
}
