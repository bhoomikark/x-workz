// nnpackage - external
package com.xworkz.late.external.nnpackage;

import com.xworkz.late.internal.nnpackage.Vehicle;

public class Garage {
    Vehicle vehicle;

    public Garage(Vehicle vehicle) {
        System.out.println("Parameterized constructor of Garage");
        this.vehicle = vehicle;
    }

    public void service() {
        if (vehicle != null) {
            vehicle.repair();
        } else {
            System.out.println("No vehicle to repair");
        }
    }
}
