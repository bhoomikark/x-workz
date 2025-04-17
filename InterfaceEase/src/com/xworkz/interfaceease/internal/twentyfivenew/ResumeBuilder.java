package com.xworkz.interfaceease.internal.twentyfivenew;

public class ResumeBuilder implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Resume Builder");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Resume Builder");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Resume Builder");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Resume Builder");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Resume Builder");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Resume Builder");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Resume Builder");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Resume Builder");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Resume Builder");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Resume Builder");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Resume Builder");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Resume Builder");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Resume Builder");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Resume Builder");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Resume Builder");
    }
}
