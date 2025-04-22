
package com.xworkz.late.external.ypackage;

import com.xworkz.late.internal.ypackage.YouTube;

public class Person {
    YouTube yt;

    public Person(YouTube yt) {
        System.out.println("Running parameterized constructor of Person");
        this.yt = yt;
    }

    public void watch() {
        if (yt != null) {
            yt.stream();
        } else {
            System.out.println("YouTube is not accessible");
        }
    }
}
