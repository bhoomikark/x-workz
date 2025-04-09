package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.SmartBoard;

public class SmartBoardRunner {
    public static void main(String[] args) {
        SmartBoard smartBoard = new SmartBoard("Interactive", "Rectangle", "Glass");
        System.out.println("SmartBoard to string: " + smartBoard.toString());
    }
}
