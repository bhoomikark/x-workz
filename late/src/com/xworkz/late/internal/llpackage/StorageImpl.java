// llpackage - implementation
package com.xworkz.late.internal.llpackage;

public class StorageImpl implements Storage {
    public StorageImpl() {
        super();
        System.out.println("No-arg constructor of StorageImpl");
    }

    @Override
    public void save() {
        System.out.println("Overriding Storage - Data saved successfully");
    }
}
