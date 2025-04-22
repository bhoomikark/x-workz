package com.xworkz.late.internal.ypackage;

public class Vloggers implements YouTube {
    public Vloggers() {
        super();
        System.out.println("No arg constructor of Vloggers");
    }

    @Override
    public void stream() {
        System.out.println("Overriding YouTube - Vloggers are streaming content");
    }
}
