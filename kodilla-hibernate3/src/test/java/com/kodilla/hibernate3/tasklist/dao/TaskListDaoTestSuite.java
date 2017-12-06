package com.kodilla.hibernate3.tasklist.dao;

import com.kodilla.hibernate3.task.Task;
import com.kodilla.hibernate3.task.TaskFinancialDetails;
import com.kodilla.hibernate3.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TaskListDaoTestSuite {

    private static final String LISTNAME = "ToDo list";

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "ToDo tasks";

    @Test
    public void Should_HaveOneTaskList_When_FindByListNameIsUsed() {

        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> theTaskList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, theTaskList.size());

        //CleanUp
        int id = theTaskList.get(0).getId();
        taskListDao.delete(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);

        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);

        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);

        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);

        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskListDao.delete(id);
    }
}
