package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.sheet.Sheet;
import com.xworkz.lilyblossomstore.internal.sheet.Paper;

public class SheetRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Sheet sheet1 = new Sheet();
        sheet1.fold();
        sheet1.tear();
        sheet1.writeOn();
        sheet1.print();
        sheet1.recycle();

        Sheet sheet = new Paper();
        sheet.fold();
        sheet.tear();
        sheet.writeOn();
        sheet.print();
        sheet.recycle();

        System.out.println("-----------");

        Paper paper = new Paper();
        paper.fold();
        paper.tear();
        paper.writeOn();
        paper.print();
        paper.recycle();
    }
}
