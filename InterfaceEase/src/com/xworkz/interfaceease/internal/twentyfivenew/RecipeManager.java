package com.xworkz.interfaceease.internal.twentyfivenew;

public class RecipeManager implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Recipe Manager");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Recipe Manager");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Recipe Manager");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Recipe Manager");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Recipe Manager");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Recipe Manager");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Recipe Manager");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Recipe Manager");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Recipe Manager");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Recipe Manager");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Recipe Manager");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Recipe Manager");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Recipe Manager");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Recipe Manager");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Recipe Manager");
    }
}
