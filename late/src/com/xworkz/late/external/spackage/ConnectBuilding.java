// spackage external
package com.xworkz.late.external.spackage;

import com.xworkz.late.internal.spackage.Pillars;

public class ConnectBuilding {
    Pillars pillars;

    public ConnectBuilding(Pillars pillars) {
        System.out.println("Running parameterized constructor of ConnectBuilding");
        this.pillars = pillars;
    }

    public void checkSupport() {
        if (this.pillars != null) {
            this.pillars.hold();
        } else {
            System.out.println("No pillars available to support the building");
        }
    }
}
