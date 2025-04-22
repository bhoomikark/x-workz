
package com.xworkz.late.external.cpackage;

import com.xworkz.late.internal.cpackage.Nuts;

public class Door {
    Nuts nuts;

    public Door(Nuts nuts) {
        System.out.println("Running parameterized constructor of Door");
        this.nuts = nuts;
    }

    public void install() {
        if (this.nuts != null) {
            this.nuts.fix();
        } else {
            System.out.println("Nuts not available");
        }
    }
}
