package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.pencil.Pencil;
import com.xworkz.lilyblossomstore.internal.pencil.MechanicalPencil;

public class PencilRunner {
    public static void main(String[] args) {
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
