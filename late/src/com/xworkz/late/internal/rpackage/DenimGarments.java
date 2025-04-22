package com.xworkz.late.internal.rpackage;

public class DenimGarments implements DenimThread {
    public DenimGarments() {
        super();
        System.out.println("No arg constructor of DenimGarments");
    }

    @Override
    public void stitch() {
        System.out.println("Overriding DenimThread - Stitching denim garments");
    }
}
