package com.xworkz.late.internal.xpackage;

public class Users implements Instagram {
    public Users() {
        super();
        System.out.println("No arg constructor of Users");
    }

    @Override
    public void post() {
        System.out.println("Overriding Instagram - Users are posting on Instagram");
    }
}
