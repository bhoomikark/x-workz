package com.xworkz.lilyblossomstore.internal.ink;

public class InvisibleInk extends Ink {
    public InvisibleInk() {
        super();
        System.out.println("Child Class");
        System.out.println("Invisible Ink appears under UV light...");
    }

    @Override
    public void color() {
        System.out.println("Child Class");
        System.out.println("Invisible Ink is colorless until exposed to UV light...");
    }

    @Override
    public void dry() {
        System.out.println("Child Class");
        System.out.println("Invisible Ink dries without leaving visible marks...");
    }

    @Override
    public void permanence() {
        System.out.println("Child Class");
        System.out.println("Invisible Ink can be semi-permanent or temporary...");
    }

    @Override
    public void use() {
        System.out.println("Child Class");
        System.out.println("Used for secret messages and security purposes...");
    }
}
