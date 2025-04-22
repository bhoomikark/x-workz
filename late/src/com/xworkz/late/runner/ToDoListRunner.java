
package com.xworkz.late.runner;

import com.xworkz.late.internal.vvpackage.*;
import com.xworkz.late.external.vvpackage.*;

public class ToDoListRunner {
    public static void main(String[] args) {
        Task task = new TaskImpl();
        ToDoList list = new ToDoList(task);
        list.showTasks();
    }
}
