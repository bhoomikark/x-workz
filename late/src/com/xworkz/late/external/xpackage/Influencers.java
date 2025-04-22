
package com.xworkz.late.external.xpackage;

import com.xworkz.late.internal.xpackage.Instagram;

public class Influencers {
    Instagram insta;

    public Influencers(Instagram insta) {
        System.out.println("Running parameterized constructor of Influencers");
        this.insta = insta;
    }

    public void engage() {
        if (insta != null) {
            insta.post();
        } else {
            System.out.println("Instagram is not working for influencers");
        }
    }
}
