package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Telescope;

public class TelescopeRunner {
    public static void main(String[] args) {
        Telescope telescope = new Telescope("Reflecting", 50.0, true);
        System.out.println(telescope);
    }
}
