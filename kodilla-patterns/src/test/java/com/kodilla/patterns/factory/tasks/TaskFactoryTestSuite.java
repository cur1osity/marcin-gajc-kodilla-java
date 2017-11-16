package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();

    @Test
    public void Should_make_and_execute_driving_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.DRIVING);

        //when
        task.executeTask();
        String taskName = task.getTaskName();

        //then
        Assert.assertTrue(task.isTaskExecuted());
        Assert.assertEquals("Do driving", taskName);
    }

    @Test
    public void Should_make_and_execute_painting_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.PAINTING);

        //when
        task.executeTask();
        String taskName = task.getTaskName();

        //then
        Assert.assertTrue(task.isTaskExecuted());
        Assert.assertEquals("Do painting", taskName);
    }

    @Test
    public void Should_make_and_execute_shopping_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING);

        //when
        task.executeTask();
        String taskName = task.getTaskName();

        //then
        Assert.assertTrue(task.isTaskExecuted());
        Assert.assertEquals("Do shopping", taskName);
    }
}
