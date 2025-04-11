package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Worker;

public class WorkerRunner {
    public static void main(String[] args) {
        Worker worker = new Worker("Ramesh", "Construction", 15);
        System.out.println(worker);
        System.out.println("Overridden HashCode: " + worker.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(worker));
    }
}
