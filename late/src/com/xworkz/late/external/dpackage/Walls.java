
package com.xworkz.late.external.dpackage;

import com.xworkz.late.internal.dpackage.Toothpaste;

public class Walls {
    Toothpaste paste;

    public Walls(Toothpaste paste) {
        System.out.println("Running parameterized constructor of Walls");
        this.paste = paste;
    }

    public void shine() {
        if (this.paste != null) {
            this.paste.clean();
        } else {
            System.out.println("Paste is missing");
        }
    }
}
