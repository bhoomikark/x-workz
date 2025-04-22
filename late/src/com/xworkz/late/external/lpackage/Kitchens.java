
package com.xworkz.late.external.lpackage;

import com.xworkz.late.internal.lpackage.Tap;

public class Kitchens {
    Tap tap;

    public Kitchens(Tap tap) {
        System.out.println("Running parameterized constructor of Kitchens");
        this.tap = tap;
    }

    public void useTap() {
        if (this.tap != null) {
            this.tap.flow();
        } else {
            System.out.println("Tap is not installed in the kitchen");
        }
    }
}
