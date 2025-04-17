package com.xworkz.interfaceease.internal.twentyfivenew;

public class ReportManager implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Report Manager");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Report Manager");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Report Manager");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Report Manager");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Report Manager");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Report Manager");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Report Manager");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Report Manager");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Report Manager");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Report Manager");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Report Manager");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Report Manager");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Report Manager");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Report Manager");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Report Manager");
    }
}
