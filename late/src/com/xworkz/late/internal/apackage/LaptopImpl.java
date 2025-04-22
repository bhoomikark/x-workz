package com.xworkz.late.internal.apackage;

public class LaptopImpl implements Laptop{
    public LaptopImpl()
    {
        super();
        System.out.println("No arg constructor of Laptop Impl");
    }
    @Override
    public void process() {
        System.out.println("Overriding laptop");
    }
}
