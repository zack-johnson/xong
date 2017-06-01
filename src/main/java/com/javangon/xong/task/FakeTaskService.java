package com.javangon.xong.task;

import com.javangon.xong.web.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

import static java.util.UUID.randomUUID;

@Service
public class FakeTaskService implements TaskService {

    @Override
    public Collection<Task> getAllTasks(User user) {
        return Arrays.asList(
                new Task(randomUUID(), "Task 1"),
                new Task(randomUUID(), "Task 2")
        );
    }
}
