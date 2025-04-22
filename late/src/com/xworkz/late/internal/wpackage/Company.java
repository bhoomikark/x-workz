package com.xworkz.late.internal.wpackage;

public class Company implements Gmail {
    public Company() {
        super();
        System.out.println("No arg constructor of Company");
    }

    @Override
    public void send() {
        System.out.println("Overriding Gmail - Company is sending email via Gmail");
    }
}
