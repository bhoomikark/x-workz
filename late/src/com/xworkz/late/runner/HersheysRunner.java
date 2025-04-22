
package com.xworkz.late.runner;

import com.xworkz.late.internal.upackage.*;
import com.xworkz.late.external.upackage.*;

public class HersheysRunner {
    public static void main(String[] args) {
        ChocolateSyrup syrup = new Childrens();
        Hersheys hersheys = new Hersheys(syrup);
        hersheys.serve();
    }
}
