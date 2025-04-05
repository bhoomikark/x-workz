package com.xworkz.lilyblossomstore.internal.circuit;

public class Circuit {
    public Circuit() {

        System.out.println("Running Circuit Constructor in Circuit class");
    }

    public void connect() {
        System.out.println("Parent Class");
        System.out.println("Connecting the circuit.");
    }

    public void disconnect() {
        System.out.println("Parent Class");
        System.out.println("Disconnecting the circuit.");
    }

    public void test() {
        System.out.println("Parent Class");
        System.out.println("Testing the circuit.");
    }
}
