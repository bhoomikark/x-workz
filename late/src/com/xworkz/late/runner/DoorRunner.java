
package com.xworkz.late.runner;

import com.xworkz.late.internal.cpackage.*;
import com.xworkz.late.external.cpackage.*;

public class DoorRunner {
    public static void main(String[] args) {
        Nuts nuts = new Holder();
        Door door = new Door(nuts);
        door.install();
    }
}
