// aapackage - implementation
package com.xworkz.late.internal.aapackage;

public class Hypermarkets implements Target {
    public Hypermarkets() {
        super();
        System.out.println("No-arg constructor of Hypermarkets");
    }

    @Override
    public void attract() {
        System.out.println("Overriding Target - Hypermarkets attracting people");
    }
}
