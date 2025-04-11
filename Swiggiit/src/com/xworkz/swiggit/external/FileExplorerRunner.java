package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.FileExplorer;

public class FileExplorerRunner {
    public static void main(String[] args) {
        FileExplorer explorer = new FileExplorer(25, 3, 120);
        System.out.println("FileExplorer to string: " + explorer.toString());
        System.out.println("FileExplorer HashCode: " + explorer.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(explorer));
    }
    }

