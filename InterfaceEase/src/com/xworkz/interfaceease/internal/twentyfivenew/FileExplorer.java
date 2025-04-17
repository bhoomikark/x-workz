package com.xworkz.interfaceease.internal.twentyfivenew;

public class FileExplorer implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- File exlporer");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable --  File exlporer");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- File exlporer ");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- File exlporer ");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- File exlporer");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- File exlporer");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- File exlporer");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- File exlporer ");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- File exlporer");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- File exlporer");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- File exlporer");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- File exlporer");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- File exlporer");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- File exlporer ");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- File exlporer");
    }
}

