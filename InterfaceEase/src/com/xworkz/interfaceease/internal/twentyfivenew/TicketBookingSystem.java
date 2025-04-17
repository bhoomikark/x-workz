package com.xworkz.interfaceease.internal.twentyfivenew;

public class TicketBookingSystem implements Printable, Editable, Savable, Deletable, Viewable {

    @Override
    public void deleteItem() {
        System.out.println("delete items -- Deletable -- Ticket Booking System");
    }

    @Override
    public void restoreDeletedItem() {
        System.out.println("restore deleted items -- Deletable -- Ticket Booking System");
    }

    @Override
    public void confirmDelete() {
        System.out.println("confirm deleting items -- Deletable -- Ticket Booking System");
    }

    @Override
    public void editContent() {
        System.out.println("edit content -- Editable -- Ticket Booking System");
    }

    @Override
    public void updateChanges() {
        System.out.println("update changes -- Editable -- Ticket Booking System");
    }

    @Override
    public void undoLastEdit() {
        System.out.println("undo last editing -- Editable -- Ticket Booking System");
    }

    @Override
    public void printPreview() {
        System.out.println("print preview -- Printable -- Ticket Booking System");
    }

    @Override
    public void printContent() {
        System.out.println("print content -- Printable -- Ticket Booking System");
    }

    @Override
    public void printSummary() {
        System.out.println("print summary -- Printable -- Ticket Booking System");
    }

    @Override
    public void saveToFile() {
        System.out.println("save to file -- Savable -- Ticket Booking System");
    }

    @Override
    public void autoSave() {
        System.out.println("auto save -- Savable -- Ticket Booking System");
    }

    @Override
    public void saveAsDraft() {
        System.out.println("save as draft -- Savable -- Ticket Booking System");
    }

    @Override
    public void openView() {
        System.out.println("open view -- Viewable -- Ticket Booking System");
    }

    @Override
    public void zoomIn() {
        System.out.println("zoom in -- Viewable -- Ticket Booking System");
    }

    @Override
    public void displayInfo() {
        System.out.println("display info -- Viewable -- Ticket Booking System");
    }
}
