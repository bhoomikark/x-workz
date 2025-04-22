
package com.xworkz.late.runner;

import com.xworkz.late.internal.hpackage.*;
import com.xworkz.late.external.hpackage.*;

public class HouseRunner {
    public static void main(String[] args) {
        Rack rack = new Shop();
        House house = new House(rack);
        house.organize();
    }
}
