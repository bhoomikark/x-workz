package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.dentist.TeethEquipments;

public class DentistRunner {
    public static void main(String[] args) {
        TeethEquipments obj = new TeethEquipments();
        obj.checkup();
        obj.treat();
        obj.tools();
    }
}
