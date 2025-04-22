// aapackage - external
package com.xworkz.late.external.aapackage;

import com.xworkz.late.internal.aapackage.Target;

public class People {
    Target target;

    public People(Target target) {
        System.out.println("Parameterized constructor of People");
        this.target = target;
    }

    public void visit() {
        if (target != null) {
            target.attract();
        } else {
            System.out.println("No target set for people");
        }
    }
}
