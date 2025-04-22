package com.xworkz.late.external.apackage;

import com.xworkz.late.internal.apackage.Laptop;

public class OperatingSystem {
    Laptop laptop;

    public OperatingSystem(Laptop laptop) {
        System.out.println("Running parameterized constructor Operating System");
        this.laptop = laptop;
    }

    public void execute() {
        if (this.laptop != null) {
            this.laptop.process();
        } else {
            System.out.println("Error");
        }
    }
}
