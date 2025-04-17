package com.xworkz.interfaceease.internal.twentyfivenew;

public class OnlineFormFiller implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Online Form Filler");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Online Form Filler");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Online Form Filler");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Online Form Filler");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Online Form Filler");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Online Form Filler");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Online Form Filler");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Online Form Filler");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Online Form Filler");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Online Form Filler");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Online Form Filler");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Online Form Filler");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Online Form Filler");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Online Form Filler");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Online Form Filler");
    }
}
