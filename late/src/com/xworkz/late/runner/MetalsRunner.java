
package com.xworkz.late.runner;

import com.xworkz.late.internal.mpackage.*;
import com.xworkz.late.external.mpackage.*;

public class MetalsRunner {
    public static void main(String[] args) {
        Mat mat = new BuildingConstruct();
        Metals metals = new Metals(mat);
        metals.useMat();
    }
}
