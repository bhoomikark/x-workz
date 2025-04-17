package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtyseven.*;

public class FourtySevenRunner {
    public static void main(String[] args) {
        Painter p = new Artist();
        p.sketch();
        p.paint();
        p.display();
    }
}
