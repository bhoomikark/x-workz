package com.xworkz.late.internal.mpackage;

public class BuildingConstruct implements Mat {
    public BuildingConstruct() {
        super();
        System.out.println("No arg constructor of BuildingConstruct");
    }

    @Override
    public void place() {
        System.out.println("Overriding Mat - Mat placed at entrance of building");
    }
}
