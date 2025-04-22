// eepackage - external
package com.xworkz.late.external.eepackage;

import com.xworkz.late.internal.eepackage.Park;

public class JurassicPark {
    Park park;

    public JurassicPark(Park park) {
        System.out.println("Parameterized constructor of JurassicPark");
        this.park = park;
    }

    public void showcase() {
        if (park != null) {
            park.explore();
        } else {
            System.out.println("No animals to explore in the park");
        }
    }
}
