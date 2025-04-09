package com.xworkz.swiggit.internal;

public class FileExplorer {
    private int numberOfFolders;
    private int drivesAvailable;
    private int numberOfFiles;

    public FileExplorer(int numberOfFolders, int drivesAvailable, int numberOfFiles) {
        this.numberOfFolders = numberOfFolders;
        this.drivesAvailable = drivesAvailable;
        this.numberOfFiles = numberOfFiles;
        System.out.println("16. Running FileExplorer Constructor");
    }

    @Override
    public String toString() {
        return "Number of Folders: " + numberOfFolders + ", Drives Available: " + drivesAvailable +
                ", Number of Files: " + numberOfFiles;
    }
}
