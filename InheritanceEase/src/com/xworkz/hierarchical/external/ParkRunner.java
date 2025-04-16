package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.waterpark.GRS;
import com.xworkz.hierarchical.internal.waterpark.Wonderla;

public class ParkRunner {
    public static void main(String[] args) {
        Wonderla w = new Wonderla();
        w.showFee();
        w.fun();

        GRS g = new GRS();
        g.showFee();
        g.timings();
    }
}
