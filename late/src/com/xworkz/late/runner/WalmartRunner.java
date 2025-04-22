// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.bbpackage.*;
import com.xworkz.late.external.bbpackage.*;

public class WalmartRunner {
    public static void main(String[] args) {
        ChainManagement cm = new Company();
        Walmart walmart = new Walmart(cm);
        walmart.operate();
    }
}
