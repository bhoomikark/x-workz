// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.hhpackage.*;
import com.xworkz.late.external.hhpackage.*;

public class RestaurantRunner {
    public static void main(String[] args) {
        Table table = new TableImpl();
        Restaurant res = new Restaurant(table);
        res.dine();
    }
}
