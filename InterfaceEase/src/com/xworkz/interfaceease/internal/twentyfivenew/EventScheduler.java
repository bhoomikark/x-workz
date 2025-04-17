package com.xworkz.interfaceease.internal.twentyfivenew;

public class EventScheduler implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- event scheduler");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- event scheduler");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- event scheduler");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- event scheduler");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- event scheduler");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- event scheduler");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- event scheduler");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- event scheduler");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- event scheduler");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- event scheduler");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable --event scheduler");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- event scheduler");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- event scheduler");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- event scheduler");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- event scheduler");
    }
}
