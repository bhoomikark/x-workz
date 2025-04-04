package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.soap.Soap;
import com.xworkz.lilyblossomstore.internal.soap.HandSoap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new HandSoap();
        soap.clean();
        soap.createFoam();
        soap.washHands();
        soap.removeGerms();
        soap.dry();

        System.out.println("-----------");

        HandSoap handSoap = new HandSoap();
        handSoap.clean();
        handSoap.createFoam();
        handSoap.washHands();
        handSoap.removeGerms();
        handSoap.dry();


    }
}
