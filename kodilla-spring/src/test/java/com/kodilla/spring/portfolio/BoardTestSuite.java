package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

//    private ApplicationContext context;

    @Autowired
    private Board board;
//
    @Autowired
    private TaskList toDoList;



//    @Before
//    public void setupSpring() {
//        context = new AnnotationConfigApplicationContext(BoardConfig.class);
//        board = context.getBean(Board.class);
//    }


    @Test
    public void Should_return_string_Zadanie1_When_Task_is_added_to_toDoList() {

        //given
        //@Before
        //when
        board.getToDoList().addTask("Zadanie 1");
        String taskName = board.getToDoList().getTask(0);

        //then
        Assert.assertEquals("Zadanie 1", taskName);

        Assert.assertEquals(board.getToDoList(), toDoList);
    }

    @Test
    public void Should_return_string_Zadanie2_When_Task_is_added_to_inProgress() {

        //given
        //@Before
        //when
        board.getInProgressList().addTask("Zadanie 2");
        String taskName = board.getInProgressList().getTask(0);

        //then
        Assert.assertEquals("Zadanie 2", taskName);
    }

    @Test
    public void Should_return_string_Zadanie3_When_Task_is_added_to_doneList() {

        //given
        //@Before
        //when
        board.getDoneList().addTask("Zadanie 3");
        String taskName = board.getDoneList().getTask(0);

        //then
        Assert.assertEquals("Zadanie 3", taskName);
    }
}
