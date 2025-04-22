
package com.xworkz.late.external.kpackage;

import com.xworkz.late.internal.kpackage.Water;

public class ConstructBuilding {
    Water water;

    public ConstructBuilding(Water water) {
        System.out.println("Running parameterized constructor of ConstructBuilding");
        this.water = water;
    }

    public void build() {
        if (this.water != null) {
            this.water.use();
        } else {
            System.out.println("Water supply not available for construction");
        }
    }
}
