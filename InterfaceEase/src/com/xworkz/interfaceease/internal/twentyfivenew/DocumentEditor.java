package com.xworkz.interfaceease.internal.twentyfivenew;

public class DocumentEditor implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Document editor");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- Document editor ");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- Document editor");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable --  Document editor");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Document editor");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Document editor");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- Document editor");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- Documenteditor");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- Document editor");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- Document editor ");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- Documentt editor");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- Document editor");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- Document editor");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- Document editor");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- Document editor");
    }
}
