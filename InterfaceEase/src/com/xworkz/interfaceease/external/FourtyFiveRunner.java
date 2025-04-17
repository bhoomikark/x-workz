package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtyfive.*;

public class FourtyFiveRunner {
    public static void main(String[] args) {
        Book b = new Novel();
        b.open();
        b.read();
        b.close();
        b.write();
    }
}
