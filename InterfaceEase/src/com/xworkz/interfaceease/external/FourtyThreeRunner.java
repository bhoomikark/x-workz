package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtythree.*;

public class FourtyThreeRunner {
    public static void main(String[] args) {
        Mobile m = new Smartphone();
        m.call();
        m.message();
        m.browse();
        m.makeNotes();
    }
}
