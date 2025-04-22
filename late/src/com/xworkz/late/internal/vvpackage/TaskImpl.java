
package com.xworkz.late.internal.vvpackage;

public class TaskImpl implements Task {
    public TaskImpl() {
        super();
        System.out.println("No-arg constructor of TaskImpl");
    }

    @Override
    public void perform() {
        System.out.println("Overriding Task - Performing task");
    }
}
