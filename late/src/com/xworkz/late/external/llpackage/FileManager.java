// llpackage - external
package com.xworkz.late.external.llpackage;

import com.xworkz.late.internal.llpackage.Storage;

public class FileManager {
    Storage storage;

    public FileManager(Storage storage) {
        System.out.println("Parameterized constructor of FileManager");
        this.storage = storage;
    }

    public void manageFiles() {
        if (storage != null) {
            storage.save();
        } else {
            System.out.println("No storage available");
        }
    }
}
