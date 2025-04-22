package com.xworkz.late.runner;

import com.xworkz.late.external.Government;
import com.xworkz.late.internal.CitizenConstituitionImpl;
import com.xworkz.late.internal.Constitution;

public class GovernmentRunner {
    public static void main(String[] args) {
        Constitution constitution=new CitizenConstituitionImpl();
        Government government=new Government(constitution);
        government.execute();
    }
}
