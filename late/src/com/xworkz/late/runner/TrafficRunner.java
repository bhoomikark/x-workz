
package com.xworkz.late.runner;

import com.xworkz.late.internal.ipackage.*;
import com.xworkz.late.external.ipackage.*;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficSignals signals = new TrafficPolice();
        Traffic traffic = new Traffic(signals);
        traffic.manage();
    }
}
