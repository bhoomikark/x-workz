package com.xworkz.interfaceease.internal.twentyfivenew;

public class NotePadApp implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- NotePad App");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- NotePad App");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- NotePad App");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- NotePad App");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- NotePad App");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- NotePad App");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- NotePad App");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- NotePad App");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- NotePad App");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- NotePad App");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- NotePad App");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- NotePad App");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- NotePad App");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- NotePad App");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- NotePad App");
    }
}
