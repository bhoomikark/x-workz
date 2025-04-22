
package com.xworkz.late.runner;

import com.xworkz.late.internal.fpackage.*;
import com.xworkz.late.external.fpackage.*;

public class IronRunner {
    public static void main(String[] args) {
        Alloy alloy = new Steel();
        Iron iron = new Iron(alloy);
        iron.create();
    }
}
