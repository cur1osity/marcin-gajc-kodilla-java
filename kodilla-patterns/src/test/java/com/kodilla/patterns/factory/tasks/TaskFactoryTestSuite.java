package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    private TaskFactory taskFactory = new TaskFactory();

    @Test
    public void Should_make_driving_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.DRIVING);

        //when
        String taskName = task.getTaskName();

        //then
        Assert.assertEquals("Do driving", taskName);
    }

    @Test
    public void Should_make_painting_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.PAINTING);

        //when
        String taskName = task.getTaskName();

        //then
        Assert.assertEquals("Do painting", taskName);
    }

    @Test
    public void Should_make_shopping_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.SHOPPING);

        //when
        String taskName = task.getTaskName();

        //then
        Assert.assertEquals("Do shopping", taskName);
    }

    @Test
    public void Should_execute_driving_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.DRIVING);

        //when
        task.executeTask();

        //then
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void Should_execute_painting_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.PAINTING);

        //when
        task.executeTask();

        //then
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void Should_execute_shopping_task_When_taskFactory_is_used() {

        //given
        Task task = taskFactory.makeTask(TaskFactory.Tasks.SHOPPING);

        //when
        task.executeTask();

        //then
        Assert.assertTrue(task.isTaskExecuted());
    }
}
