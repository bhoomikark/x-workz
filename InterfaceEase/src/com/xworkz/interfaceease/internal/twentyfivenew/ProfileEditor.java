package com.xworkz.interfaceease.internal.twentyfivenew;

public class ProfileEditor implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Profile Editor");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Profile Editor");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Profile Editor");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Profile Editor");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Profile Editor");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Profile Editor");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Profile Editor");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Profile Editor");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Profile Editor");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Profile Editor");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Profile Editor");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Profile Editor");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Profile Editor");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Profile Editor");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Profile Editor");
    }
}
