package com.xworkz.late.external;

import com.xworkz.late.internal.Constitution;

public class Government {
    Constitution constitution;

    public Government(Constitution constitution) {
        System.out.println("Running Parameterized constructor");
        this.constitution = constitution;
    }

    public void execute() {
        if (constitution != null) {
            this.constitution.followLaws();
        } else {
            System.out.println("null");
        }

    }
}
