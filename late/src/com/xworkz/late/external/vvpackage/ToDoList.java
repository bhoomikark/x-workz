
package com.xworkz.late.external.vvpackage;

import com.xworkz.late.internal.vvpackage.Task;

public class ToDoList {
    Task task;

    public ToDoList(Task task) {
        System.out.println("Parameterized constructor of ToDoList");
        this.task = task;
    }

    public void showTasks() {
        if (task != null) {
            task.perform();
        } else {
            System.out.println("No tasks available");
        }
    }
}
