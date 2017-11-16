package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private boolean isExecuted;

    public DrivingTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void executeTask() {

        isExecuted = true;

        System.out.println("Driving task is executed");

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
