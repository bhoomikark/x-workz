// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.nnpackage.*;
import com.xworkz.late.external.nnpackage.*;

public class GarageRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        Garage garage = new Garage(vehicle);
        garage.service();
    }
}
