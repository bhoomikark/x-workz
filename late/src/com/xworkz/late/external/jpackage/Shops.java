
package com.xworkz.late.external.jpackage;

import com.xworkz.late.internal.jpackage.SlipperStand;

public class Shops {
    SlipperStand stand;

    public Shops(SlipperStand stand) {
        System.out.println("Running parameterized constructor of Shops");
        this.stand = stand;
    }

    public void open() {
        if (this.stand != null) {
            this.stand.hold();
        } else {
            System.out.println("Slipper stand not available in shop");
        }
    }
}
