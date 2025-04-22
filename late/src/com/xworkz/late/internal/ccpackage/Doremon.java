// ccpackage - implementation
package com.xworkz.late.internal.ccpackage;

public class Doremon implements Cartoon {
    public Doremon() {
        super();
        System.out.println("No-arg constructor of Doremon");
    }

    @Override
    public void entertain() {
        System.out.println("Overriding Cartoon - Doremon entertaining children");
    }
}
