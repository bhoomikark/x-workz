package com.xworkz.lilyblossomstore.internal.pencil;

public class MechanicalPencil extends Pencil {
    public MechanicalPencil() {
        super();
        System.out.println("No-argument constructor of MechanicalPencil - Child class");
    }

    @Override
    public void write() {
        System.out.println("Writing with a mechanical pencil. - Child class");
    }

    @Override
    public void sharpen() {
        System.out.println("Mechanical pencils do not need sharpening. - Child class");
    }

    @Override
    public void erase() {
        System.out.println("Erasing with the mechanical pencil. - Child class");
    }

    @Override
    public void breakLead() {
        System.out.println("Mechanical pencil lead broke. - Child class");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the mechanical pencil with lead. - Child class");
    }
}
