// bbpackage - external
package com.xworkz.late.external.bbpackage;

import com.xworkz.late.internal.bbpackage.ChainManagement;

public class Walmart {
    ChainManagement chain;

    public Walmart(ChainManagement chain) {
        System.out.println("Parameterized constructor of Walmart");
        this.chain = chain;
    }

    public void operate() {
        if (chain != null) {
            chain.manage();
        } else {
            System.out.println("No chain management system");
        }
    }
}
