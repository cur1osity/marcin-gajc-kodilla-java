package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "First list";

    @Test
    public void Should_HaveOneTaskList_When_FindByListNameIsUsed() {

        //Given
        TaskList taskList = new TaskList("List1", DESCRIPTION);
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
}
