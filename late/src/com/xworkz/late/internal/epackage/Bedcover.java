package com.xworkz.late.internal.epackage;

public class Bedcover implements Cover {
    public Bedcover() {
        super();
        System.out.println("No arg constructor of Bedcover");
    }

    @Override
    public void wrap() {
        System.out.println("Overriding Cover - Bedcover wrapping the bed");
    }
}
