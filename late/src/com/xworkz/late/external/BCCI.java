package com.xworkz.late.external;

import com.xworkz.late.internal.ICC;

public class BCCI {
    ICC icc;

    public BCCI(ICC icc) {
        System.out.println("Parameterized Constructor of BCCI");
        this.icc = icc;

    }

    public void play() {
        if (this.icc != null) {
            this.icc.fairPlay();
        }
        else {
            System.out.println("null");
        }

    }
}
