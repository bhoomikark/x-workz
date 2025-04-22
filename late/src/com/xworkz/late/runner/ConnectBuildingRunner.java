// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.spackage.*;
import com.xworkz.late.external.spackage.*;

public class ConnectBuildingRunner {
    public static void main(String[] args) {
        Pillars pillars = new Support();
        ConnectBuilding cb = new ConnectBuilding(pillars);
        cb.checkSupport();
    }
}
