package com.xworkz.pack.internal;

public class Lens {
    private String type="convex";
    private int lensPower;
    public void setlensPower(int lensPower)
    {
        this.lensPower=lensPower;
    }
    public int getLensPower()
    {
        return lensPower;
    }
    public  Lens(String type)
    {
        this.type=type;
    }

    public void show()
    {
        System.out.println("Running show method in lens");
        System.out.println("==============================");;
        System.out.println("The type of lens is : "+this.type);
        System.out.println("the lensPower is "+this.lensPower);
        System.out.println("==============================");

    }


}
