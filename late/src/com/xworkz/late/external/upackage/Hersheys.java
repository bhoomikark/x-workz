
package com.xworkz.late.external.upackage;

import com.xworkz.late.internal.upackage.ChocolateSyrup;

public class Hersheys {
    ChocolateSyrup syrup;

    public Hersheys(ChocolateSyrup syrup) {
        System.out.println("Running parameterized constructor of Hersheys");
        this.syrup = syrup;
    }

    public void serve() {
        if (this.syrup != null) {
            this.syrup.pour();
        } else {
            System.out.println("No chocolate syrup found to serve");
        }
    }
}
