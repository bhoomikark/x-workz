// hhpackage - external
package com.xworkz.late.external.hhpackage;

import com.xworkz.late.internal.hhpackage.Table;

public class Restaurant {
    Table table;

    public Restaurant(Table table) {
        System.out.println("Parameterized constructor of Restaurant");
        this.table = table;
    }

    public void dine() {
        if (table != null) {
            table.serve();
        } else {
            System.out.println("No table available to serve");
        }
    }
}
