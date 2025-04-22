
package com.xworkz.late.runner;

import com.xworkz.late.internal.opackage.*;
import com.xworkz.late.external.opackage.*;

public class EntertainmentRunner {
    public static void main(String[] args) {
        Malls malls = new Miniso();
        Entertainment entertainment = new Entertainment(malls);
        entertainment.enjoy();
    }
}
