// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.ddpackage.*;
import com.xworkz.late.external.ddpackage.*;

public class ResortRunner {
    public static void main(String[] args) {
        Gaming g = new TrampolineParks();
        TranquilResort resort = new TranquilResort(g);
        resort.enjoy();
    }
}
