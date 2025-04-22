package com.xworkz.late.internal;

public class CitizenConstituitionImpl implements Constitution{
public CitizenConstituitionImpl()
{
    super();
    System.out.println("no arg constructor in citizen constitution impl");
}

    @Override
    public void followLaws() {
        System.out.println("Overriding follow laws");
    }
}
