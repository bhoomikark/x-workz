package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.circuit.Circuit;
import com.xworkz.lilyblossomstore.internal.circuit.ElectronicCircuit;

public class CircuitRunner {
    public static void main(String[] args) {
        System.out.println("Using parent type reference:");
        Circuit circuit = new ElectronicCircuit();
        circuit.connect();
        circuit.disconnect();
        circuit.test();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        ElectronicCircuit electronicCircuit = new ElectronicCircuit();
        electronicCircuit.connect();
        electronicCircuit.disconnect();
        electronicCircuit.test();
    }
}
