// ddpackage - external
package com.xworkz.late.external.ddpackage;

import com.xworkz.late.internal.ddpackage.Gaming;

public class TranquilResort {
    Gaming gaming;

    public TranquilResort(Gaming gaming) {
        System.out.println("Parameterized constructor of TranquilResort");
        this.gaming = gaming;
    }

    public void enjoy() {
        if (gaming != null) {
            gaming.play();
        } else {
            System.out.println("Gaming not available in resort");
        }
    }
}
