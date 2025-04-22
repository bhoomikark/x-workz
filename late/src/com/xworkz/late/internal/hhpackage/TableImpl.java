// hhpackage - implementation
package com.xworkz.late.internal.hhpackage;

public class TableImpl implements Table {
    public TableImpl() {
        super();
        System.out.println("No-arg constructor of TableImpl");
    }

    @Override
    public void serve() {
        System.out.println("Overriding Table - Table is serving food");
    }
}
