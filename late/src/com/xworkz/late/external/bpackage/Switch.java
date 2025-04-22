package com.xworkz.late.external.bpackage;

import com.xworkz.late.internal.bpackage.Wire;

public class Switch {
    Wire wire;
    public Switch(Wire wire) {
        System.out.println("Running parameterized constructor of Switch");
        this.wire = wire;
    }
    public void toggle() {
        if (this.wire != null) {
            this.wire.supply();
        } else {
            System.out.println("Wire not connected");
        }
    }
}