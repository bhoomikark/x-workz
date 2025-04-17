package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fiftyseven.*;

public class FiftySevenRunner {
    public static void main(String[] args) {
        EBookReader reader = new Kindle();
        reader.openBook();
        reader.readPage();
        reader.closeBook();
    }
}
