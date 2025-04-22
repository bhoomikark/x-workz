
package com.xworkz.late.runner;

import com.xworkz.late.internal.kpackage.*;
import com.xworkz.late.external.kpackage.*;

public class ConstructBuildingRunner {
    public static void main(String[] args) {
        Water water = new Humans();
        ConstructBuilding building = new ConstructBuilding(water);
        building.build();
    }
}
