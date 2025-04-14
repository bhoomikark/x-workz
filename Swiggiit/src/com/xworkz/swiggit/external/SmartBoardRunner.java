package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SmartBoard;

public class SmartBoardRunner {
    public static void main(String[] args) {
        SmartBoard smartBoard = new SmartBoard("Interactive", "Rectangle", "Glass");
        System.out.println("SmartBoard to string: " + smartBoard.toString());
        System.out.println("Overridden HashCode: " + smartBoard.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(smartBoard));
        SmartBoard smartBoard1 = new SmartBoard("Interactive", "Square", "Glass");
        SmartBoard smartBoard2 = new SmartBoard("Interactive", "Circle", "Plastic");

        System.out.println("smartBoard.equals(smartBoard1)? " + smartBoard.equals(smartBoard1));
        System.out.println("smartBoard.equals(smartBoard2)? " + smartBoard.equals(smartBoard2));
    }
    }

