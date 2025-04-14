package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SwitchBoard;

public class SwitchBoardRunner {
    public static void main(String[] args) {
        SwitchBoard switchBoard = new SwitchBoard(6, "Anchor", 3);

        System.out.println("SwitchBoard to string: " + switchBoard.toString());
        System.out.println("Overridden HashCode: " + switchBoard.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(switchBoard));
        SwitchBoard switchBoard1 = new SwitchBoard(6, "Anchor", 3);
        SwitchBoard switchBoard2 = new SwitchBoard(6, "Anchor", 4);
        SwitchBoard switchBoard3 = new SwitchBoard(6, "Legrand", 3);

        System.out.println("switchBoard.equals(switchBoard1)? " + switchBoard1.equals(switchBoard1));
        System.out.println("switchBoard.equals(switchBoard2)? " + switchBoard1.equals(switchBoard2));
        System.out.println("switchBoard.equals(switchBoard3)? " + switchBoard1.equals(switchBoard3));

    }
}
