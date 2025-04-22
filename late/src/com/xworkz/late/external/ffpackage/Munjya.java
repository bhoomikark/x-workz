// ffpackage - external
package com.xworkz.late.external.ffpackage;

import com.xworkz.late.internal.ffpackage.Danger;

public class Munjya {
    Danger danger;

    public Munjya(Danger danger) {
        System.out.println("Parameterized constructor of Munjya");
        this.danger = danger;
    }

    public void haunt() {
        if (danger != null) {
            danger.scare();
        } else {
            System.out.println("Munjya is not scary today");
        }
    }
}
