
package com.xworkz.late.external.gpackage;

import com.xworkz.late.internal.gpackage.Tiles;

public class Templewalls {
    Tiles tiles;

    public Templewalls(Tiles tiles) {
        System.out.println("Running parameterized constructor of Templewalls");
        this.tiles = tiles;
    }

    public void decorate() {
        if (this.tiles != null) {
            this.tiles.design();
        } else {
            System.out.println("No tiles available");
        }
    }
}
