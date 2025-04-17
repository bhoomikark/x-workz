package com.xworkz.interfaceease.internal.twentyfivenew;

public class ContactListManager implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Contact List Manager");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable --Contact List Manager ");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- Contact List Manager");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Contact List Manager");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Contact List Manager");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Contact List Manager");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- Contact List Manager");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- Contact List Manager");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- Contact List Manager");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- Contact List ");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable --Contact List");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable --Contact List");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- Contact List");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- Contact List");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- Contact List ");
    }
}
