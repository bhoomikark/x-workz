package com.xworkz.multilevel.external;


import com.xworkz.multilevel.internal.bedsheet.PimaCottonBedsheet;

public class BedSheetRunner {
    public static void main(String[] args) {
        PimaCottonBedsheet pima = new PimaCottonBedsheet();
        pima.info();
        pima.details();
        pima.type();
    }
}
