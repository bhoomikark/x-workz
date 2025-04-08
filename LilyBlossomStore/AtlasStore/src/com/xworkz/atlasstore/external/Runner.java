package com.xworkz.atlasstore.external;

import com.xworkz.atlasstore.internal.Iron;
import com.xworkz.atlasstore.internal.Steel;

public class Runner {
    public static void main(String[] args) {
        Iron iron=new Iron();
        iron.checkRustFormation();
        iron.getDensity();
        iron.conductElectricity();
        iron.getMeltingPoint();
        iron.magneticProperties();
        Iron iron1=new Steel();
        iron1.checkRustFormation();
        iron1.getDensity();
        iron1.conductElectricity();
        iron1.getMeltingPoint();
        iron1.magneticProperties();
        Steel steel=new Steel();
        steel.getDensity();
        steel.checkRustFormation();
        steel.getMeltingPoint();
        steel.magneticProperties();
        steel.conductElectricity();

    }
}
