
package com.xworkz.late.external.qpackage;

import com.xworkz.late.internal.qpackage.Pencil;

public class Sketch {
    Pencil pencil;

    public Sketch(Pencil pencil) {
        System.out.println("Running parameterized constructor of Sketch");
        this.pencil = pencil;
    }

    public void create() {
        if (this.pencil != null) {
            this.pencil.draw();
        } else {
            System.out.println("No pencil found for sketching");
        }
    }
}
