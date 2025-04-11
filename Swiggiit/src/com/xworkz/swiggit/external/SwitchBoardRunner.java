package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SwitchBoard;

public class SwitchBoardRunner {
    public static void main(String[] args) {
        SwitchBoard switchBoard = new SwitchBoard(6, "Anchor", 3);

        System.out.println("SwitchBoard to string: " + switchBoard.toString());
        System.out.println("Overridden HashCode: " + switchBoard.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(switchBoard));
    }
}
