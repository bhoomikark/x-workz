package com.xworkz.interfaceease.internal.twentyfivenew;

public class UserAccountTool implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- User Account Tool");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- User Account Tool");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- User Account Tool");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- User Account Tool");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- User Account Tool");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- User Account Tool");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- User Account Tool");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- User Account Tool");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- User Account Tool");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- User Account Tool");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- User Account Tool");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- User Account Tool");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- User Account Tool");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- User Account Tool");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- User Account Tool");
    }
}
