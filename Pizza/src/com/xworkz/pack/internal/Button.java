package com.xworkz.pack.internal;

public class Button {
   private String Color="Blue";
    private String Shape="Round";
    private final Board board;
    Button(String Color, String Shape,Board board)
    {
        this.Color=Color;
        this.Shape=Shape;
        this.board=board;
    }
    public void showButton()
    {
        System.out.println("Running showButton in button");
        System.out.println("The Color of button is: "+this.Color);
        System.out.println("The shape of button is: "+this.Shape);
        System.out.println("=========================================");
        System.out.println("Connecting board class with button");
        this.board.setSize(10);
        this.board.showBoard();


    }
}
