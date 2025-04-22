// runner
package com.xworkz.late.runner;

import com.xworkz.late.internal.llpackage.*;
import com.xworkz.late.external.llpackage.*;

public class FileManagerRunner {
    public static void main(String[] args) {
        Storage storage = new StorageImpl();
        FileManager manager = new FileManager(storage);
        manager.manageFiles();
    }
}
