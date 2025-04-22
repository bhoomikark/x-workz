// vpackage external
package com.xworkz.late.external.vpackage;

import com.xworkz.late.internal.vpackage.Clips;

public class Handbags {
    Clips clips;

    public Handbags(Clips clips) {
        System.out.println("Running parameterized constructor of Handbags");
        this.clips = clips;
    }

    public void secure() {
        if (clips != null) {
            clips.hold();
        } else {
            System.out.println("No clips available for handbags");
        }
    }
}
