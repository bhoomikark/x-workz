package com.xworkz.lilyblossomstore.internal.circuit;

public class ElectronicCircuit extends Circuit {
    public ElectronicCircuit() {
        super();
        System.out.println("Child Class");
        System.out.println("Running ElectronicCircuit Constructor in ElectronicCircuit class");
    }

    @Override
    public void connect() {
        System.out.println("Child Class");
        System.out.println("Connecting the electronic circuit.");
    }

    @Override
    public void disconnect() {
        System.out.println("Child Class");
        System.out.println("Disconnecting the electronic circuit.");
    }

    @Override
    public void test() {
        System.out.println("Child Class");
        System.out.println("Testing the electronic circuit.");
    }
}
