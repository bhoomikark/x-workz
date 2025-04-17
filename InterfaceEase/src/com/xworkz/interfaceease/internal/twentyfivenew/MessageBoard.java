package com.xworkz.interfaceease.internal.twentyfivenew;

public class MessageBoard implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Message Board");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Message Board");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Message Board");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Message Board");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Message Board");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Message Board");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Message Board");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Message Board");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Message Board");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Message Board");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Message Board");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Message Board");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Message Board");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Message Board");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Message Board");
    }
}
