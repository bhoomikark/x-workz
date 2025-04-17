package com.xworkz.interfaceease.internal.twentyfivenew;

public class ProductCatalogTool implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Product Catalog Tool");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Product Catalog Tool");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Product Catalog Tool");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Product Catalog Tool");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Product Catalog Tool");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Product Catalog Tool");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Product Catalog Tool");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Product Catalog Tool");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Product Catalog Tool");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Product Catalog Tool");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Product Catalog Tool");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Product Catalog Tool");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Product Catalog Tool");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Product Catalog Tool");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Product Catalog Tool");
    }
}
