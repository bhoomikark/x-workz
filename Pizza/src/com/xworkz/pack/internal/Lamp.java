package com.xworkz.pack.internal;

public class Lamp {
    private String lampType="LED";
    private long wattage=150L;
    private final Lens lens;
    public Lamp(String lampType,long wattage,Lens lens)
    {
        this.lampType=lampType;
        this.wattage=wattage;
        this.lens=lens;
    }
    public void display()
    {
        System.out.println("Running lens class in lamp class");
        System.out.println("Lamp type: "+lampType);
        System.out.println("Lamp type: "+wattage);
        this.lens.setlensPower(5);
        this.lens.show();

    }
}
