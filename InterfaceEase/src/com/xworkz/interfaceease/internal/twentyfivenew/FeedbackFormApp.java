package com.xworkz.interfaceease.internal.twentyfivenew;

public class FeedbackFormApp implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- feedback form app");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- feedback form app ");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- feedback form app");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- feedback form app");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- feedback form app");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable --feedback form app");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- feedback form app ");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- feedback form app ");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable --feedback form app");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- feedback form app");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- feedback form app");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- feedback form app");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- feedback form app");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- feedback form app ");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable --feedback form app ");
    }
}

