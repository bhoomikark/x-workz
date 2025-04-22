
package com.xworkz.late.runner;

import com.xworkz.late.internal.jpackage.*;
import com.xworkz.late.external.jpackage.*;

public class ShopsRunner {
    public static void main(String[] args) {
        SlipperStand stand = new Slippers();
        Shops shop = new Shops(stand);
        shop.open();
    }
}
