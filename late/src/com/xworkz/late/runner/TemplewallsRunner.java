
package com.xworkz.late.runner;

import com.xworkz.late.internal.gpackage.*;
import com.xworkz.late.external.gpackage.*;

public class TemplewallsRunner {
    public static void main(String[] args) {
        Tiles tiles = new Floor();
        Templewalls temple = new Templewalls(tiles);
        temple.decorate();
    }
}
