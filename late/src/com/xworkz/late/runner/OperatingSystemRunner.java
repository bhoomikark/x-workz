package com.xworkz.late.runner;

import com.xworkz.late.external.apackage.*;
import com.xworkz.late.internal.apackage.*;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        Laptop laptop=new LaptopImpl();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.execute();

    }
}
