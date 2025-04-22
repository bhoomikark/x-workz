// ccpackage - external
package com.xworkz.late.external.ccpackage;

import com.xworkz.late.internal.ccpackage.Cartoon;

public class Children {
    Cartoon cartoon;

    public Children(Cartoon cartoon) {
        System.out.println("Parameterized constructor of Children");
        this.cartoon = cartoon;
    }

    public void watch() {
        if (cartoon != null) {
            cartoon.entertain();
        } else {
            System.out.println("No cartoon for children");
        }
    }
}
