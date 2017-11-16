package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private boolean isExecuted;

    public PaintingTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void executeTask() {

        isExecuted = true;

        System.out.println("Painting task is executed");

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