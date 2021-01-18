package com.ironhack.classes;
import java.util.ArrayList;

/** Exercise 5: Create a Task List class where users can track Tasks.
 * Tasks should be a separate class with a boolean property that tracks whether
 * or not the task has been completed. */

public class TaskList {
    // Properties
    private ArrayList<Task> taskList;

    // Constructor
    public TaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    // Task done
    public void taskDone(int id) {
        taskList.get(id).setDone(true);
    }

    // Task done remove
    public void removeTaskDone() {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getDone()) {
                taskList.remove(i);
            }
        }
    }

    // Getters & Setters
    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }
}
