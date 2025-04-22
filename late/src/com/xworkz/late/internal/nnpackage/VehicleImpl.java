// nnpackage - implementation
package com.xworkz.late.internal.nnpackage;

public class VehicleImpl implements Vehicle {
    public VehicleImpl() {
        super();
        System.out.println("No-arg constructor of VehicleImpl");
    }

    @Override
    public void repair() {
        System.out.println("Overriding Vehicle - Vehicle repaired");
    }
}
