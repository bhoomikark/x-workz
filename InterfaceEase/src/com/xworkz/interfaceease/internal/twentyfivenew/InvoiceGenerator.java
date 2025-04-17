package com.xworkz.interfaceease.internal.twentyfivenew;

public class InvoiceGenerator implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Invoice Generator");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- Invoice Generator");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- Invoice Generator");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Invoice Generator ");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Invoice Generator");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Invoice Generator");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- Invoice Generator ");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- Invoice Generator ");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- Invoice Generator");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- Invoice Generator ");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- Invoice Generatorr");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- Invoice Generator");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- Invoice Generator");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- Invoice Generator");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- Invoice Generator");
    }
}

