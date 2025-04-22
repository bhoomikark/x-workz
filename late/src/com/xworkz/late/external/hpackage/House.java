
package com.xworkz.late.external.hpackage;

import com.xworkz.late.internal.hpackage.Rack;

public class House {
    Rack rack;

    public House(Rack rack) {
        System.out.println("Running parameterized constructor of House");
        this.rack = rack;
    }

    public void organize() {
        if (this.rack != null) {
            this.rack.arrange();
        } else {
            System.out.println("No rack found to organize");
        }
    }
}
