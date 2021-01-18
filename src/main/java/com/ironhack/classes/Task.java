package com.ironhack.classes;

public class Task {
    // Properties
    private String task;
    private Boolean done;

    // Constructor
    public Task(String task) {
        setTask(task);
        setDone(false);
    }

    // Getters & Setters

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
