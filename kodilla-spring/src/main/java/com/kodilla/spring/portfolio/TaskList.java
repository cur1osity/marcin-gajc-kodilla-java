package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public String getTask(int index) {
        return tasks.get(index);
    }
}
