package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.repository.TaskRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test list";
    private static final String DESCRIPTION = "This is test list";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTasksList = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(1, readTasksList.size());
        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}