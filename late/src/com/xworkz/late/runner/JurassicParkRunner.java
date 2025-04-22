// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.eepackage.*;
import com.xworkz.late.external.eepackage.*;

public class JurassicParkRunner {
    public static void main(String[] args) {
        Park park = new Animals();
        JurassicPark jp = new JurassicPark(park);
        jp.showcase();
    }
}
