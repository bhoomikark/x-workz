package com.xworkz.singlelevel.external;

import com.xworkz.singlelevel.internal.device.Laptop;

public class DeviceRunner {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.On();
        laptop.Off();
    }
}
