package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.smartboard.SmartBoard;
import com.xworkz.lilyblossomstore.internal.smartboard.InteractiveSmartBoard;

public class SmartBoardRunner {
    public static void main(String[] args) {
        // Parent type reference to child object
        SmartBoard smartBoard = new InteractiveSmartBoard();
        smartBoard.display();
        smartBoard.touchControl();
        smartBoard.connectToInternet();
        smartBoard.writeWithStylus();
        smartBoard.recordSession();

        System.out.println("-----------");

        // Child type reference to child object
        InteractiveSmartBoard interactiveSmartBoard = new InteractiveSmartBoard();
        interactiveSmartBoard.display();
        interactiveSmartBoard.touchControl();
        interactiveSmartBoard.connectToInternet();
        interactiveSmartBoard.writeWithStylus();
        interactiveSmartBoard.recordSession();
    }
}
