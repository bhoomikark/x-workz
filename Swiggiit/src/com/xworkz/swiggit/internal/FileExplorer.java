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
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 333;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof FileExplorer) {
            FileExplorer other = (FileExplorer) obj;
            if (this.numberOfFolders == other.numberOfFolders) {
                System.out.println("Both are same");
                return true;
            }
        }
        return false;
    }
}
