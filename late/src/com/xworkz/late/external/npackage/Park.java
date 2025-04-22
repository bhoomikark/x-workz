
package com.xworkz.late.external.npackage;

import com.xworkz.late.internal.npackage.Stairs;

public class Park {
    Stairs stairs;

    public Park(Stairs stairs) {
        System.out.println("Running parameterized constructor of Park");
        this.stairs = stairs;
    }

    public void enter() {
        if (this.stairs != null) {
            this.stairs.climb();
        } else {
            System.out.println("No stairs available to enter the park");
        }
    }
}
