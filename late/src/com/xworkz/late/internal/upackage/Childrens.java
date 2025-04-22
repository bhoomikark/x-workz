package com.xworkz.late.internal.upackage;

public class Childrens implements ChocolateSyrup {
    public Childrens() {
        super();
        System.out.println("No arg constructor of Childrens");
    }

    @Override
    public void pour() {
        System.out.println("Overriding ChocolateSyrup - Children love chocolate syrup!");
    }
}
