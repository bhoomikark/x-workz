package com.xworkz.interfaceease.internal.twentyfivenew;

public class EBookCreator implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- ebook");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- ebook ");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- ebook");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- ebook");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- ebook");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- ebook");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- ebook");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- ebook");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- ebook");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- ebook ");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- ebook");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- ebook");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable --  ebook");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- ebook");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- ebbok");
    }
}

