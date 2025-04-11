package com.xworkz.swiggit.internal;

public class Intelj {
    private String inteljFolders;
    private int numberOfFiles;
    private int numberOfProjectsCreated;

    public Intelj(String inteljFolders, int numberOfFiles, int numberOfProjectsCreated) {
        this.inteljFolders = inteljFolders;
        this.numberOfFiles = numberOfFiles;
        this.numberOfProjectsCreated = numberOfProjectsCreated;
        System.out.println("30. Running Intelj Constructor");
    }

    @Override
    public String toString() {
        return "Intelj Folders: " + inteljFolders + ", Number of Files: " + numberOfFiles +
                ", Number of Projects Created: " + numberOfProjectsCreated;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 789;
    }
}
