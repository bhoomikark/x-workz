// eepackage - implementation
package com.xworkz.late.internal.eepackage;

public class Animals implements Park {
    public Animals() {
        super();
        System.out.println("No-arg constructor of Animals");
    }

    @Override
    public void explore() {
        System.out.println("Overriding Park - Animals are exploring the park");
    }
}
