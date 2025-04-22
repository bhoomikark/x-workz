// epackage external
package com.xworkz.late.external.epackage;

import com.xworkz.late.internal.epackage.Cover;

public class Invitation {
    Cover cover;

    public Invitation(Cover cover) {
        System.out.println("Running parameterized constructor of Invitation");
        this.cover = cover;
    }

    public void send() {
        if (this.cover != null) {
            this.cover.wrap();
        } else {
            System.out.println("No cover to send invitation");
        }
    }
}