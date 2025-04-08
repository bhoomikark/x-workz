package com.xworkz.lilyblossomstore.internal.government;

public class GovernmentOfficers {
    public void offers(Government gov) {
        System.out.println("\nInside GovernmentOfficers class");

        gov.makeLaws();
        gov.collectTaxes();
        gov.provideSecurity();
        gov.manageEconomy();
        gov.publicServices();

        if (gov instanceof PoliceDepartment) {
            PoliceDepartment police = (PoliceDepartment) gov;
            police.conductInvestigation();
        }
    }
}
