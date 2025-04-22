
package com.xworkz.late.external.ipackage;

import com.xworkz.late.internal.ipackage.TrafficSignals;

public class Traffic {
    TrafficSignals signals;

    public Traffic(TrafficSignals signals) {
        System.out.println("Running parameterized constructor of Traffic");
        this.signals = signals;
    }

    public void manage() {
        if (this.signals != null) {
            this.signals.control();
        } else {
            System.out.println("No traffic signals working");
        }
    }
}
