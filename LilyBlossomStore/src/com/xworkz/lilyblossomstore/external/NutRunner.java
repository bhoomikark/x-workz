package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.nut.Nut;
import com.xworkz.lilyblossomstore.internal.nut.HexNut;

public class NutRunner {
    public static void main(String[] args) {
        Nut nut = new HexNut();
        nut.fasten();
        nut.loosen();
        nut.holdBolt();
        nut.rustProtection();
        nut.adjustTightness();

        System.out.println("-----------");

        HexNut hexNut = new HexNut();
        hexNut.fasten();
        hexNut.loosen();
        hexNut.holdBolt();
        hexNut.rustProtection();
        hexNut.adjustTightness();
    }
}
