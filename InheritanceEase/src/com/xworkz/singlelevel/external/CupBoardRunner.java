package com.xworkz.singlelevel.external;

import com.xworkz.singlelevel.internal.cupboard.IronCupBoard;

public class CupBoardRunner {
    public static void main(String[] args) {
        IronCupBoard ironCupBoard=new IronCupBoard();
        ironCupBoard.Open();
        ironCupBoard.close();
    }
}
