package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.pencil.Pencil;
import com.xworkz.lilyblossomstore.internal.pencil.MechanicalPencil;

public class PencilRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Pencil pencil1 = new Pencil();
        pencil1.write();
        pencil1.sharpen();
        pencil1.erase();
        pencil1.breakLead();
        pencil1.refill();

        Pencil pencil = new MechanicalPencil();
        pencil.write();
        pencil.sharpen();
        pencil.erase();
        pencil.breakLead();
        pencil.refill();

        System.out.println("-----------");

        MechanicalPencil mechanicalPencil = new MechanicalPencil();
        mechanicalPencil.write();
        mechanicalPencil.sharpen();
        mechanicalPencil.erase();
        mechanicalPencil.breakLead();
        mechanicalPencil.refill();
    }
}
