// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.npackage.*;
import com.xworkz.late.external.npackage.*;

public class ParkRunner {
    public static void main(String[] args) {
        Stairs stairs = new Terrace();
        Park park = new Park(stairs);
        park.enter();
    }
}
