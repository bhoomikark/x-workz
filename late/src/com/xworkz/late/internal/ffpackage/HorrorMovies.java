// ffpackage - implementation
package com.xworkz.late.internal.ffpackage;

public class HorrorMovies implements Danger {
    public HorrorMovies() {
        super();
        System.out.println("No-arg constructor of HorrorMovies");
    }

    @Override
    public void scare() {
        System.out.println("Overriding Danger - HorrorMovies are scary");
    }
}
