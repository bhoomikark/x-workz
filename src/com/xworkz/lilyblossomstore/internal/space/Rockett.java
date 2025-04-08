package com.xworkz.lilyblossomstore.internal.space;

public class Rockett extends Spacecraft {
    public Rockett() {
        super();
        System.out.println("Running Rockett Constructor in Rockett class");
    }

    @Override
    public void launch() {
        System.out.println("Child class");
        System.out.println("Rockett is launching with high velocity...");
    }

    @Override
    public void land() {
        System.out.println("Child class");
        System.out.println("Rockett is landing safely using thrusters...");
    }

    @Override
    public void orbit() {
        System.out.println("Child class");
        System.out.println("Rockett is orbiting Earth to deliver payload...");
    }

    @Override
    public void communicate() {
        System.out.println("Child class");
        System.out.println("Rockett is communicating through satellite relay...");
    }

    @Override
    public void collectData() {
        System.out.println("Child class");
        System.out.println("Rockett is collecting telemetry and flight data...");
    }

    public void deploySatellite() {
        System.out.println("Rockett is deploying a satellite into orbit.");
    }
}
