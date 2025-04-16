package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.electricvehicle.Auto;
import com.xworkz.hierarchical.internal.electricvehicle.Scooty;

public class VehicleRunner {
    public static void main(String[] args) {
        Scooty s = new Scooty();
        s.charge();
        s.scootyInfo();

        Auto a = new Auto();
        a.charge();
        a.autoInfo();
    }
}
