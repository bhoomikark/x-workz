
package com.xworkz.late.runner;

import com.xworkz.late.internal.lpackage.*;
import com.xworkz.late.external.lpackage.*;

public class KitchensRunner {
    public static void main(String[] args) {
        Tap tap = new Shever();
        Kitchens kitchens = new Kitchens(tap);
        kitchens.useTap();
    }
}
