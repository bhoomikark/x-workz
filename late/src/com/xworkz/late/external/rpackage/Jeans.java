// rpackage external
package com.xworkz.late.external.rpackage;

import com.xworkz.late.internal.rpackage.DenimThread;

public class Jeans {
    DenimThread thread;

    public Jeans(DenimThread thread) {
        System.out.println("Running parameterized constructor of Jeans");
        this.thread = thread;
    }

    public void wear() {
        if (this.thread != null) {
            this.thread.stitch();
        } else {
            System.out.println("Denim thread not available for jeans");
        }
    }
}
