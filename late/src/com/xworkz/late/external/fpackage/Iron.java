
package com.xworkz.late.external.fpackage;

import com.xworkz.late.internal.fpackage.Alloy;

public class Iron {
    Alloy alloy;

    public Iron(Alloy alloy) {
        System.out.println("Running parameterized constructor of Iron");
        this.alloy = alloy;
    }

    public void create() {
        if (this.alloy != null) {
            this.alloy.mix();
        } else {
            System.out.println("No alloy found");
        }
    }
}
