package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.belt.Belt;
import com.xworkz.lilyblossomstore.internal.belt.LeatherBelt;

public class BeltRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Belt belt2= new Belt();
        belt2.wear();
        belt2.adjust();
        belt2.remove();
        belt2.buckle();
        belt2.tighten();

        Belt belt = new LeatherBelt();
        belt.wear();
        belt.adjust();
        belt.remove();
        belt.buckle();
        belt.tighten();
        LeatherBelt belt1= new LeatherBelt();
        belt1.wear();
        belt1.adjust();
        belt1.remove();
        belt1.buckle();
        belt1.tighten();
    }
}
