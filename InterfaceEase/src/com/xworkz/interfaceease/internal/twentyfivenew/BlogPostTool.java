package com.xworkz.interfaceease.internal.twentyfivenew;

public class BlogPostTool implements Printable,Editable,Savable,Deletable,Viewable{
    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- BlogPost Tool");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println(" restore deleted items -- Deletable -- BlogPost Tool");
    }

    @Override
    public void confirmDelete() {
        System.out.println(" confirm deleting items -- Deletable -- BlogPost Tool");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- BlogPost Tool");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- BlogPost Tool");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- BlogPost Tool");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- printable -- BlogPost Tool");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- printable -- BlogPost Tool");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- printable -- BlogPost Tool");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- savable -- BlogPost Tool");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- savable -- BlogPost Tool");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- savable -- BlogPost Tool");
    }

    @Override
    public void openView() {
        System.out.println("open view-- Viewable -- BlogPost Tool");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in-- Viewable -- BlogPost Tool");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info-- Viewable -- BlogPost Tool");
    }
}
