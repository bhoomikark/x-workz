
package com.xworkz.late.external.opackage;

import com.xworkz.late.internal.opackage.Malls;

public class Entertainment {
    Malls malls;

    public Entertainment(Malls malls) {
        System.out.println("Running parameterized constructor of Entertainment");
        this.malls = malls;
    }

    public void enjoy() {
        if (this.malls != null) {
            this.malls.visit();
        } else {
            System.out.println("No malls to visit for entertainment");
        }
    }
}
