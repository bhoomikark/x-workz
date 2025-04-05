package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.smartboard.SmartBoard;
import com.xworkz.lilyblossomstore.internal.smartboard.InteractiveSmartBoard;

public class SmartBoardRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        SmartBoard smartBoard1 = new SmartBoard();
        smartBoard1.display();
        smartBoard1.touchControl();
        smartBoard1.connectToInternet();
        smartBoard1.writeWithStylus();
        smartBoard1.recordSession();


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
