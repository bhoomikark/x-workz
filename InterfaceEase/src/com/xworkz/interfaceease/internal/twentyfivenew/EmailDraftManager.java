package com.xworkz.interfaceease.internal.twentyfivenew;

public class EmailDraftManager implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- email manager");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable --  email manager");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- email manager");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- email manager");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- email manager");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- email manager");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- email manager");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- email manager");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- email manager");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- email manager ");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- email manager");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- email manager");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- email manager");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- email manager");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- email manager");
    }
}

