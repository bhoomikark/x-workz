// bbpackage - implementation
package com.xworkz.late.internal.bbpackage;

public class Company implements ChainManagement {
    public Company() {
        super();
        System.out.println("No-arg constructor of Company");
    }

    @Override
    public void manage() {
        System.out.println("Overriding ChainManagement - Company manages supply chain");
    }
}
