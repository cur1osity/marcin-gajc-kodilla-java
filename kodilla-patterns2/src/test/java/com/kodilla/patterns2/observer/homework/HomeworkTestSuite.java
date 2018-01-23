package com.kodilla.patterns2.observer.homework;


import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void studentTaskTest(){
        // Given
        Mentor johnSmith = new Mentor("John Smith");
        Mentor joeDoe = new Mentor("Joe Doe");
        StudentTaskQueue queue1 = new StudentTaskQueue("Marcin");
        StudentTaskQueue queue2 = new StudentTaskQueue("Piotr");
        StudentTaskQueue queue3 = new StudentTaskQueue("Michal");

        // When
        queue1.registerObserver(johnSmith);
        queue2.registerObserver(joeDoe);
        queue3.registerObserver(joeDoe);

        queue1.addMessage("Task 1");
        queue1.addMessage("Task 2");

        queue2.addMessage("Task 1");
        queue2.addMessage("Task 2");
        queue2.addMessage("Task 3");

        queue3.addMessage("Task 1");

        //Then

        Assert.assertEquals(1, queue1.getObservers().size());
        Assert.assertEquals(2, queue1.getMessages().size());

        Assert.assertEquals(1, queue2.getObservers().size());
        Assert.assertEquals(3, queue2.getMessages().size());

        Assert.assertEquals(1, queue3.getObservers().size());
        Assert.assertEquals(1, queue3.getMessages().size());


        Assert.assertEquals("Task 1", joeDoe.getLastMessage());
        Assert.assertEquals("Task 2", johnSmith.getLastMessage());

        Assert.assertEquals(4, joeDoe.getUpdateCount());
        Assert.assertEquals(2, johnSmith.getUpdateCount());
    }
}

