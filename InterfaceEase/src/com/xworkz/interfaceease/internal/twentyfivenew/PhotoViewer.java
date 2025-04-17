package com.xworkz.interfaceease.internal.twentyfivenew;

public class PhotoViewer implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Photo Viewer");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Photo Viewer");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Photo Viewer");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Photo Viewer");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Photo Viewer");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Photo Viewer");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Photo Viewer");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Photo Viewer");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Photo Viewer");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Photo Viewer");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Photo Viewer");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Photo Viewer");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Photo Viewer");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Photo Viewer");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Photo Viewer");
    }
}
