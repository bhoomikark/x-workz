package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.soap.Soap;
import com.xworkz.lilyblossomstore.internal.soap.HandSoap;

public class SoapRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Soap soap1 = new Soap();
        soap1.clean();
        soap1.createFoam();
        soap1.washHands();
        soap1.removeGerms();
        soap1.dry();

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
