package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private boolean isExecuted;

    public ShoppingTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void executeTask() {

        isExecuted = true;

        System.out.println("Shopping task is executed");

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
