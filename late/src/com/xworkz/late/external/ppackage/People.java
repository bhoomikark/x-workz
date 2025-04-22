
package com.xworkz.late.external.ppackage;

import com.xworkz.late.internal.ppackage.Metro;

public class People {
    Metro metro;

    public People(Metro metro) {
        System.out.println("Running parameterized constructor of People");
        this.metro = metro;
    }

    public void commute() {
        if (this.metro != null) {
            this.metro.travel();
        } else {
            System.out.println("No metro available for travel");
        }
    }
}
