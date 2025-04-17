package com.xworkz.interfaceease.internal.fourtyeight;

public class SoftwareEngineer implements Developer {
    @Override
    public void code() {
        System.out.println("Writing code...");
    }

    @Override
    public void test() {
        System.out.println("Testing the code...");
    }

    @Override
    public void deploy() {
        System.out.println("Code deployed.");
    }
@Override
    public  void develop()
    {
        System.out.println("develop-- default -- software engineer");
    }
}
