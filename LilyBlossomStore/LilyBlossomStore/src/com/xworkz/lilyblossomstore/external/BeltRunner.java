package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.belt.Belt;
import com.xworkz.lilyblossomstore.internal.belt.LeatherBelt;

public class BeltRunner {
    public static void main(String[] args) {
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
